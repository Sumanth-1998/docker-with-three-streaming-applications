import avro.CustomerInfo;
import avro.CustomerOrderInfo;
import avro.Order;
import io.confluent.kafka.serializers.AbstractKafkaSchemaSerDeConfig;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.kafka.common.utils.Bytes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.*;
import org.apache.kafka.streams.state.KeyValueBytesStoreSupplier;
import org.apache.kafka.streams.state.KeyValueStore;
import org.apache.kafka.streams.state.Stores;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sumanth.orderstore.valuejoiner.CustomerOrderJoiner;

import java.util.*;

@ApplicationScoped
public class CustomerOrdersStreamingApplication {

    final Logger LOGGER = LoggerFactory.getLogger(CustomerOrdersStreamingApplication.class);

    SpecificAvroSerde<CustomerInfo> customerInfoSpecificAvroSerde;
    SpecificAvroSerde<Order> orderSpecificAvroSerde;

    SpecificAvroSerde<CustomerOrderInfo> customerOrderInfoSpecificAvroSerde;
    @PostConstruct
    public void pushMessages(){
        produceCustomerMessages();
        produceOrderMessages();
    }

    private void produceOrderMessages() {
        orderSpecificAvroSerde = new SpecificAvroSerde<>();
        Map<String, String> serdeConfig = new HashMap<>();
        serdeConfig.put(AbstractKafkaSchemaSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://schemaregistry:8085");
        orderSpecificAvroSerde.configure(serdeConfig, false);

        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "kafka-2:9093");
        properties.put(ProducerConfig.CLIENT_ID_CONFIG, "order-producer-client");



        KafkaProducer<String, Order> orderKafkaProducer = new KafkaProducer<>(properties, Serdes.String().serializer(), orderSpecificAvroSerde.serializer());
        orderKafkaProducer.send(new ProducerRecord<>("customer-orders", "1111", new Order("1111", "101", "03-09-2023", "100")));
        orderKafkaProducer.send(new ProducerRecord<>("customer-orders", "2222", new Order("2222", "102", "02-09-2023", "200")));
        orderKafkaProducer.send(new ProducerRecord<>("customer-orders", "3333", new Order("3333", "103", "01-09-2023", "300")));
        orderKafkaProducer.send(new ProducerRecord<>("customer-orders", "4444", new Order("4444", "101", "28-08-2023", "400")));
        orderKafkaProducer.send(new ProducerRecord<>("customer-orders", "5555", new Order("5555", "102", "27-08-2023", "500")));
        orderKafkaProducer.send(new ProducerRecord<>("customer-orders", "6666", new Order("6666", "103", "26-08-2023", "600")));
        orderKafkaProducer.send(new ProducerRecord<>("customer-orders", "7777", new Order("7777", "101", "25-08-2023", "700")));
        orderKafkaProducer.send(new ProducerRecord<>("customer-orders", "8888", new Order("8888", "102", "24-08-2023", "800")));
        orderKafkaProducer.send(new ProducerRecord<>("customer-orders", "9999", new Order("9999", "103", "23-08-2023", "900")));
        orderKafkaProducer.send(new ProducerRecord<>("customer-orders", "1010", new Order("1010", "101", "22-08-2023", "1000")));

    }

    private void produceCustomerMessages() {

        customerInfoSpecificAvroSerde = new SpecificAvroSerde<>();
        Map<String, String> serdeConfig = new HashMap<>();
        serdeConfig.put(AbstractKafkaSchemaSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://schemaregistry:8085");
        customerInfoSpecificAvroSerde.configure(serdeConfig, false);


        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "kafka-2:9093");
        properties.put(ProducerConfig.CLIENT_ID_CONFIG, "customerorderapp");

        KafkaProducer<String, CustomerInfo> customerInfoProducer = new KafkaProducer<>(properties, Serdes.String().serializer(), customerInfoSpecificAvroSerde.serializer());
        customerInfoProducer.send(new ProducerRecord<>("customer-information", "101", new CustomerInfo("Bheem", "sumanth@everywhere.com", "12536548", "101")));
        customerInfoProducer.send(new ProducerRecord<>("customer-information", "102", new CustomerInfo("Kalia", "kalia@everywhere.com", "858585858", "102")));
        customerInfoProducer.send(new ProducerRecord<>("customer-information", "103", new CustomerInfo("Raju", "raju@everywhere.com", "979797", "103")));
    }


    @Produces
    public Topology testTopo(){
        StreamsBuilder streamsBuilder = new StreamsBuilder();
        KeyValueBytesStoreSupplier keyValueBytesStoreSupplier = Stores.persistentKeyValueStore("customer-info-key-value-store");
        Materialized<String, CustomerInfo, KeyValueStore<Bytes, byte[]>> customerMaterialized = Materialized.<String, CustomerInfo>as(keyValueBytesStoreSupplier)
                .withKeySerde(Serdes.String())
                .withValueSerde(customerInfoSpecificAvroSerde);

        KTable<String, CustomerInfo> customerKTable = streamsBuilder.stream("customer-information", Consumed.with(Serdes.String(), customerInfoSpecificAvroSerde))
                .toTable(Named.as("customer-info-table"), customerMaterialized);



        KeyValueBytesStoreSupplier orderKeyStoreSupplier = Stores.persistentKeyValueStore("order-key-value-store");
        Materialized<String, List<Order>, KeyValueStore<Bytes, byte[]>> ordersMaterialized = Materialized.<String, List<Order>>as(orderKeyStoreSupplier)
                .withKeySerde(Serdes.String())
                .withValueSerde(Serdes.ListSerde(ArrayList.class, orderSpecificAvroSerde));

        KTable<String, List<Order>> orderKTable = streamsBuilder.stream("customer-orders", Consumed.with(Serdes.String(), orderSpecificAvroSerde))
                .selectKey((key, order) -> order.get("ssn").toString())
                .groupByKey(Grouped.with(Serdes.String(), orderSpecificAvroSerde))
                .aggregate(ArrayList::new,
                        (key, order, orderList) -> {
                            orderList.add(order);
                            return orderList;
                        },
                        ordersMaterialized
                );

        customerOrderInfoSpecificAvroSerde = new SpecificAvroSerde<>();
        Map<String, String> serdeConfig = new HashMap<>();
        serdeConfig.put(AbstractKafkaSchemaSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://schemaregistry:8085");
        customerOrderInfoSpecificAvroSerde.configure(serdeConfig, false);
        KeyValueBytesStoreSupplier joinedTableMaterialized = Stores.persistentKeyValueStore("joined-table-key-value-store");
        Materialized<String, CustomerOrderInfo, KeyValueStore<Bytes, byte[]>> joinedMaterialized = Materialized.<String, CustomerOrderInfo>as(joinedTableMaterialized)
                .withKeySerde(Serdes.String())
                .withValueSerde(customerOrderInfoSpecificAvroSerde);

        customerKTable.join(orderKTable,
                new CustomerOrderJoiner(),
                joinedMaterialized)
                .toStream()
                .peek((s, customerOrderInfo) -> {
                    LOGGER.info("$$$$$$$$ " + s + "$$$$$ " + customerOrderInfo);
                })
                .to("customer-orders-information", Produced.with(Serdes.String(), customerOrderInfoSpecificAvroSerde));
        return streamsBuilder.build();
    }


}

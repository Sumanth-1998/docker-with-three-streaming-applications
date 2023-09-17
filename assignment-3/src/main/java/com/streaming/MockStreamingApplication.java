package com.streaming;

import avro.*;
import io.confluent.kafka.serializers.AbstractKafkaSchemaSerDeConfig;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import joiner.MappedPlanProductRelProductJoiner;
import joiner.ProductPlanAttributesJoiner;
import mapper.PlanProductRelMapper;
import joiner.PlanProductRelValueJoiner;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.common.utils.Bytes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.*;
import org.apache.kafka.streams.state.KeyValueBytesStoreSupplier;
import org.apache.kafka.streams.state.KeyValueStore;
import org.apache.kafka.streams.state.Stores;

import java.util.*;

@ApplicationScoped
public class MockStreamingApplication {

    SpecificAvroSerde<Plan> planSpecificAvroSerde = new SpecificAvroSerde<>();
    SpecificAvroSerde<PlanProductRel> planProductRelSpecificAvroSerde = new SpecificAvroSerde<>();
    SpecificAvroSerde<Product> productSpecificAvroSerde = new SpecificAvroSerde<>();
    SpecificAvroSerde<ProductAttributes> productAttributesSpecificAvroSerde = new SpecificAvroSerde<>();
    SpecificAvroSerde<TempDto> tempDtoSpecificAvroSerde = new SpecificAvroSerde<>();


    @PostConstruct
    public void produceMessages(){
        Properties producerProperties = new Properties();
        producerProperties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "kafka-3:9094");
        producerProperties.put(ProducerConfig.CLIENT_ID_CONFIG, "producer-002");

        Map<String, String> serdeConfig = new HashMap<>();
        serdeConfig.put(AbstractKafkaSchemaSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://schemaregistry:8085");
        planSpecificAvroSerde.configure(serdeConfig, false);
        planProductRelSpecificAvroSerde.configure(serdeConfig, false);
        productSpecificAvroSerde.configure(serdeConfig, false);
        productAttributesSpecificAvroSerde.configure(serdeConfig, false);
        tempDtoSpecificAvroSerde.configure(serdeConfig, false);

        KafkaProducer<String, Plan> planKafkaProducer = new KafkaProducer<>(producerProperties, Serdes.String().serializer(), planSpecificAvroSerde.serializer());
        planKafkaProducer.send(new ProducerRecord<>("plan", "101", new Plan("101", "Basic")));
        planKafkaProducer.send(new ProducerRecord<>("plan", "102", new Plan("102", "Medium")));
        planKafkaProducer.send(new ProducerRecord<>("plan", "103", new Plan("103", "Advanced")));
        planKafkaProducer.send(new ProducerRecord<>("plan", "104", new Plan("104", "Ultimate")));

        KafkaProducer<String, PlanProductRel> planProductRelKafkaProducer = new KafkaProducer<>(producerProperties, Serdes.String().serializer(), planProductRelSpecificAvroSerde.serializer());
        planProductRelKafkaProducer.send(new ProducerRecord<>("plan-product-rel", "1001", new PlanProductRel("1001", "101", "10001")));
        planProductRelKafkaProducer.send(new ProducerRecord<>("plan-product-rel", "1002", new PlanProductRel("1002", "102", "10002")));
        planProductRelKafkaProducer.send(new ProducerRecord<>("plan-product-rel", "1003", new PlanProductRel("1003", "103", "10003")));
        planProductRelKafkaProducer.send(new ProducerRecord<>("plan-product-rel", "1004", new PlanProductRel("1004", "104", "10004")));
        planProductRelKafkaProducer.send(new ProducerRecord<>("plan-product-rel", "1005", new PlanProductRel("1005", "101", "10005")));
        planProductRelKafkaProducer.send(new ProducerRecord<>("plan-product-rel", "1006", new PlanProductRel("1006", "102", "10006")));
        planProductRelKafkaProducer.send(new ProducerRecord<>("plan-product-rel", "1007", new PlanProductRel("1007", "103", "10007")));
        planProductRelKafkaProducer.send(new ProducerRecord<>("plan-product-rel", "1008", new PlanProductRel("1008", "104", "10008")));

        KafkaProducer<String, Product> productKafkaProducer = new KafkaProducer<>(producerProperties, Serdes.String().serializer(), productSpecificAvroSerde.serializer());
        productKafkaProducer.send(new ProducerRecord<>("products", "10001", new Product("10001", "Mobile Data")));
        productKafkaProducer.send(new ProducerRecord<>("products", "10002", new Product("10002", "Calls")));
        productKafkaProducer.send(new ProducerRecord<>("products", "10003", new Product("10003", "International Calls")));
        productKafkaProducer.send(new ProducerRecord<>("products", "10004", new Product("10004", "SMS")));
        productKafkaProducer.send(new ProducerRecord<>("products", "10005", new Product("10005", "MMS")));
        productKafkaProducer.send(new ProducerRecord<>("products", "10006", new Product("10006", "Prime")));
        productKafkaProducer.send(new ProducerRecord<>("products", "10007", new Product("10007", "Netflix")));
        productKafkaProducer.send(new ProducerRecord<>("products", "10008", new Product("10008", "Hotstar")));

        KafkaProducer<String, ProductAttributes> productAttributesKafkaProducer = new KafkaProducer<>(producerProperties, Serdes.String().serializer(), productAttributesSpecificAvroSerde.serializer());
        productAttributesKafkaProducer.send(new ProducerRecord<>("product-attributes", "111", new ProductAttributes("111", "10001", "Quantity", "Unlimited")));
        productAttributesKafkaProducer.send(new ProducerRecord<>("product-attributes", "222", new ProductAttributes("222", "10001", "Duration", "10")));
        productAttributesKafkaProducer.send(new ProducerRecord<>("product-attributes", "333", new ProductAttributes("333", "10002", "Quantity", "Unlimited")));
        productAttributesKafkaProducer.send(new ProducerRecord<>("product-attributes", "444", new ProductAttributes("444", "10002", "Additional Charge", "2 rs/s")));
        productAttributesKafkaProducer.send(new ProducerRecord<>("product-attributes", "555", new ProductAttributes("555", "10003", "Activated", "yes")));
        productAttributesKafkaProducer.send(new ProducerRecord<>("product-attributes", "666", new ProductAttributes("666", "10003", "Pricing", "10 rs/s")));
        productAttributesKafkaProducer.send(new ProducerRecord<>("product-attributes", "777", new ProductAttributes("777", "10004", "Quantity", "100")));
        productAttributesKafkaProducer.send(new ProducerRecord<>("product-attributes", "888", new ProductAttributes("888", "10004", "Additional Charge", "5")));
        productAttributesKafkaProducer.send(new ProducerRecord<>("product-attributes", "999", new ProductAttributes("999", "10005", "Additional Charge", "5")));
        productAttributesKafkaProducer.send(new ProducerRecord<>("product-attributes", "1111", new ProductAttributes("1111", "10005", "Pricing", "5")));
        productAttributesKafkaProducer.send(new ProducerRecord<>("product-attributes", "2222", new ProductAttributes("2222", "10006", "Additional Charge", "5")));
        productAttributesKafkaProducer.send(new ProducerRecord<>("product-attributes", "3333", new ProductAttributes("3333", "10006", "Duration", "12")));
        productAttributesKafkaProducer.send(new ProducerRecord<>("product-attributes", "4444", new ProductAttributes("4444", "10007", "Quantity", "5")));
        productAttributesKafkaProducer.send(new ProducerRecord<>("product-attributes", "5555", new ProductAttributes("5555", "10007", "Additional Charge", "5")));
        productAttributesKafkaProducer.send(new ProducerRecord<>("product-attributes", "6666", new ProductAttributes("6666", "10008", "Additional Charge", "5")));
        productAttributesKafkaProducer.send(new ProducerRecord<>("product-attributes", "7777", new ProductAttributes("7777", "10008", "Bonus", "100")));

    }

    @Produces
    public Topology createStreamingApp(){

        StreamsBuilder streamsBuilder = new StreamsBuilder();
        KTable<String, Plan> planKTable = getPlanKTable(streamsBuilder);
        KTable<String, List<PlanProductRel>> planProductRelKTable = getPlanProductRelKTable(streamsBuilder);
        KTable<String, List<TempDto>> planProductRelJoined = joinPlanProductRel(planKTable, planProductRelKTable);
        KTable<String, TempDto> mappedProductPlanKTable = mapPlanProductJoined(planProductRelJoined);
        KTable<String, Product> productKTable = getProductKTable(streamsBuilder);
        KTable<String, TempDto> productRelPlanProductJoinedKTable = joinMappedProductPlanProduct(mappedProductPlanKTable, productKTable);
        KTable<String, List<ProductAttributes>> productAttributesKTable = getProductAttributesKTable(streamsBuilder);
        KTable<String, TempDto> planProductAttributesJoined = joinProductPlanAttributes(productRelPlanProductJoinedKTable, productAttributesKTable);
        planProductAttributesJoined.toStream()
                .peek((s, tempDto) -> System.out.println(s + "=======================>" + tempDto))
                .to("product-plan", Produced.with(Serdes.String(), tempDtoSpecificAvroSerde));
        return streamsBuilder.build();
    }

    private KTable<String, TempDto> joinProductPlanAttributes(KTable<String, TempDto> productRelPlanProductJoinedKTable, KTable<String, List<ProductAttributes>> productAttributesKTable) {
        KeyValueBytesStoreSupplier mappedProductPlanStateStore = Stores.persistentKeyValueStore("mapped-product-plan-store-3");
        Materialized<String, TempDto, KeyValueStore<Bytes, byte[]>> mappedProductPlanAttributesMaterialized = Materialized.<String, TempDto>as(mappedProductPlanStateStore)
                .withKeySerde(Serdes.String())
                .withValueSerde(tempDtoSpecificAvroSerde);
        return productRelPlanProductJoinedKTable
                .join(productAttributesKTable,
                        new ProductPlanAttributesJoiner(),
                        mappedProductPlanAttributesMaterialized
                        );
    }

    private KTable<String, List<ProductAttributes>> getProductAttributesKTable(StreamsBuilder streamsBuilder) {
        KeyValueBytesStoreSupplier keyValueBytesStoreSupplier = Stores.persistentKeyValueStore("product-attributes-key-value-store");
        Materialized<String, List<ProductAttributes>, KeyValueStore<Bytes, byte[]>> productAttributesMaterialized = Materialized.<String, List<ProductAttributes>>as(keyValueBytesStoreSupplier)
                        .withKeySerde(Serdes.String())
                                .withValueSerde(Serdes.ListSerde(ArrayList.class, productAttributesSpecificAvroSerde));
        return streamsBuilder.stream("product-attributes", Consumed.with(Serdes.String(), productAttributesSpecificAvroSerde))
                .selectKey((key, productAttributes) -> productAttributes.getProductId().toString())
                .groupByKey(Grouped.with(Serdes.String(), productAttributesSpecificAvroSerde))
                .aggregate(ArrayList::new,
                           (key, productAttribute, productAttributeList) -> {
                                productAttributeList.add(productAttribute);
                                return productAttributeList;
                           },
                            productAttributesMaterialized
                        );

    }

    private KTable<String, TempDto> joinMappedProductPlanProduct(KTable<String, TempDto> mappedProductPlanKTable, KTable<String, Product> productKTable) {
        KeyValueBytesStoreSupplier mappedProductPlanStateStore = Stores.persistentKeyValueStore("mapped-product-plan-store-2");
        Materialized<String, TempDto, KeyValueStore<Bytes, byte[]>> mappedProductPlanMaterialized = Materialized.<String, TempDto>as(mappedProductPlanStateStore)
                .withKeySerde(Serdes.String())
                .withValueSerde(tempDtoSpecificAvroSerde);
        return mappedProductPlanKTable
                .join(productKTable,
                        new MappedPlanProductRelProductJoiner(),
                        mappedProductPlanMaterialized
                        );

    }

    private KTable<String, Product> getProductKTable(StreamsBuilder streamsBuilder) {
        KeyValueBytesStoreSupplier keyValueBytesStoreSupplier = Stores.persistentKeyValueStore("product-key-value-store");
        Materialized<String, Product, KeyValueStore<Bytes, byte[]>> productMaterialised = Materialized.<String, Product>as(keyValueBytesStoreSupplier)
                        .withKeySerde(Serdes.String())
                        .withValueSerde(productSpecificAvroSerde);
        return streamsBuilder.stream("products", Consumed.with(Serdes.String(), productSpecificAvroSerde))
                .toTable(productMaterialised);
    }

    private KTable<String, TempDto> mapPlanProductJoined(KTable<String, List<TempDto>> planProductRelJoined) {
        KeyValueBytesStoreSupplier mappedProductPlanStateStore = Stores.persistentKeyValueStore("mapped-product-plan-store");
        Materialized<String, TempDto, KeyValueStore<Bytes, byte[]>> mappedProductPlanMaterialized = Materialized.<String, TempDto>as(mappedProductPlanStateStore)
                .withKeySerde(Serdes.String())
                .withValueSerde(tempDtoSpecificAvroSerde);
        return planProductRelJoined.toStream()
                .flatMap(new PlanProductRelMapper())
                .toTable(mappedProductPlanMaterialized);
    }

    private KTable<String, List<TempDto>> joinPlanProductRel(KTable<String, Plan> planKTable, KTable<String, List<PlanProductRel>> planProductRelKTable) {
        KeyValueBytesStoreSupplier planProductRelStoreSupplier = Stores.persistentKeyValueStore("plan-product-rel-store");
        Materialized<String, List<TempDto>, KeyValueStore<Bytes, byte[]>> planProductRelMaterialized = Materialized.<String, List<TempDto>>as(planProductRelStoreSupplier)
                .withKeySerde(Serdes.String())
                .withValueSerde(Serdes.ListSerde(ArrayList.class, tempDtoSpecificAvroSerde));
        return planKTable.join(
                planProductRelKTable,
                new PlanProductRelValueJoiner(),
                planProductRelMaterialized);
    }

    private KTable<String, List<PlanProductRel>> getPlanProductRelKTable(StreamsBuilder streamsBuilder) {
        KeyValueBytesStoreSupplier keyValueBytesStoreSupplier = Stores.persistentKeyValueStore("plan-product-rel-key-value-store");
        Materialized<String, List<PlanProductRel>, KeyValueStore<Bytes, byte[]>> planProductJoinedListMaterialized = Materialized.<String, List<PlanProductRel>>as(keyValueBytesStoreSupplier)
                        .withKeySerde(Serdes.String())
                                .withValueSerde(Serdes.ListSerde(ArrayList.class, planProductRelSpecificAvroSerde));
        return streamsBuilder.stream("plan-product-rel", Consumed.with(Serdes.String(), planProductRelSpecificAvroSerde))
                .selectKey((key, planProductRel) -> planProductRel.getPlanId().toString())
                .groupByKey(Grouped.with(Serdes.String(), planProductRelSpecificAvroSerde))
                .aggregate(ArrayList::new,
                        (key, planProductRel, tempDtoList) -> {
                            tempDtoList.add(planProductRel);
                            return tempDtoList;
                        }, planProductJoinedListMaterialized);
    }

    private KTable<String, Plan> getPlanKTable(StreamsBuilder streamsBuilder){
        KeyValueBytesStoreSupplier keyValueBytesStoreSupplier = Stores.persistentKeyValueStore("plan-key-value-store");
        Materialized<String, Plan, KeyValueStore<Bytes, byte[]>> planKeyValueStoreMaterialized = Materialized.<String, Plan>as(keyValueBytesStoreSupplier)
                .withKeySerde(Serdes.String())
                .withValueSerde(planSpecificAvroSerde);
        return streamsBuilder.stream("plan", Consumed.with(Serdes.String(), planSpecificAvroSerde))
                .toTable(planKeyValueStoreMaterialized);
    }




}

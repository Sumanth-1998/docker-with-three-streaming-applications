# blocks until kafka is reachable
echo -e 'Listing kafka topics'
kafka-topics --bootstrap-server kafka-1:9092 --list

echo -e 'Creating kafka topics for assignment 1'
kafka-topics --bootstrap-server kafka-1:9092 --create --if-not-exists --topic user-information --replication-factor 3 --partitions 3
sleep 2


kafka-topics --bootstrap-server kafka-1:9092 --create --if-not-exists --topic fines --replication-factor 3 --partitions 5
sleep 2


kafka-topics --bootstrap-server kafka-1:9092 --create --if-not-exists --topic user-fines-information --replication-factor 3 --partitions 4
sleep 2

echo -e 'Creating kafka topics for assignment 2'

kafka-topics --bootstrap-server kafka-2:9093 --create --if-not-exists --topic customer-information --replication-factor 3 --partitions 4
sleep 2

kafka-topics --bootstrap-server kafka-2:9093 --create --if-not-exists --topic customer-orders --replication-factor 3 --partitions 4
sleep 2

kafka-topics --bootstrap-server kafka-2:9093 --create --if-not-exists --topic customer-orders-information --replication-factor 3 --partitions 4
sleep 2

echo -e 'Creating kafka topics for assignment 3'

kafka-topics --bootstrap-server kafka-3:9094 --create --if-not-exists --topic plan --replication-factor 3 --partitions 4
sleep 2

kafka-topics --bootstrap-server kafka-3:9094 --create --if-not-exists --topic plan-product-rel --replication-factor 3 --partitions 4
sleep 2

kafka-topics --bootstrap-server kafka-3:9094 --create --if-not-exists --topic products --replication-factor 3 --partitions 4
sleep 2

kafka-topics --bootstrap-server kafka-3:9094 --create --if-not-exists --topic product-attributes --replication-factor 3 --partitions 4
sleep 2

kafka-topics --bootstrap-server kafka-3:9094 --create --if-not-exists --topic product-plan --replication-factor 3 --partitions 4
sleep 2

echo -e 'Successfully created the following topics:'
kafka-topics --bootstrap-server kafka-1:9092 --list




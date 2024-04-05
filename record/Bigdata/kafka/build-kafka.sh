# 安装 zookeeper
docker pull zookeeper

docker run -d --name zookeeper -p 2181:2181 zookeeper

docker pull apache/kafka

docker run -d --name=kafka -p 9092:9092 --link zookeeper:zookeeper apache/kafka


./kafka-topics.sh --create --topic test --partitions 1 --replication-factor 1 \
--bootstrap-server localhost:9092

# 消费者
./kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test --from-beginning

# 生产者
./kafka-console-producer.sh --broker-list localhost:9092 --topic test

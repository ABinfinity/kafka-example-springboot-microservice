# Quickstart
STEP: START THE KAFKA ENVIRONMENT
NOTE: Your local environment should have Java 8+ installed.

Apache Kafka can be started using ZooKeeper or KRaft. To get started, follow the sections below.

Kafka with ZooKeeper
Run the following commands to start all services in the correct order:

# Start the ZooKeeper service
```
$ bin/zookeeper-server-start.sh config/zookeeper.properties
```
Open another terminal session and run:


# Start the Kafka broker service
```
$ bin/kafka-server-start.sh config/server.properties
```
Start the server & once all services have successfully launched, you will have a basic Kafka environment running and ready to use.

# Alternatively you can listen to the Kafka topic using terminal:
```
$ bin/kafka-console-consumer.sh --topic abhicode --from-beginning --bootstrap-server localhost:9092
```

Reference to this code was made from the video link below.(Credit:- Amigoscode)

https://www.youtube.com/watch?v=SqVfCyfCJqw&ab_channel=Amigoscode

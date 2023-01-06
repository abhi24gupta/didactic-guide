# Documentation

## Kafka Cluster
`Since kafka is a distributed system , it act as a custer. A Kafka cluster consists of a set of brokers. A cluster has a minimum of 3 brokers`

## Kafka Broker 
`A Kafka is the kafak server. It's just a meaningful name given to the kafka server.And this name makes sense as well because all that kafka does is act as a message broker between producer and consmer.`
`The producer and consumer don't interact directly. They se Kafka server as an agent or a broker to exchange messages.`

## Producer
`Producer is an application that sends messages to the kafka server.`
## Consumer
`Consumer is an application that reads messages from the kafka server.`
## Kafka Topic
`Topic is like a table in database or folder in a file system. Topic is identified by name. WE can have any number of topics`
## Kafka Partitions
`Kafka topicd are divided into a number of partitions, which contain records in an unchangeable sequence.`
## Offset
`Offset is a sequence of ids given to messages as the arrive at a partition. Once the offset is assigned it will never be changed. The first message gets an offset zero.`
## Consumer groups
`A consumer group contains one or more consumers working together to process the messages.`

## URL's
<li><a>https://kafka.apache.org/quickstart</a> </li>


## Lecture 10 : Configure Kafka Producer and Consumer for JSON Serializer and Deserializer
`How to send and receive a Java Object as a JSON byte[] to and from Apache Kafka.`
`Apache kafka stores and trasport byte[].There are a number of built-in serializers and deserializers but it doesn't include any for JSON.Spring kafka created a JSONSerializer and JSONDeserializer which we can use to convert Java Objects to and from JSON.`
### Approach
`We will a send java object as JSON byte[] to a kafka topic using a JSONSerializer.Afterward, we will configure how to receive a JSON byte[] and automatically convert it to a Java Object using a JSONDeserializer.`
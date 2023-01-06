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


package com.abhinavProjects.kafka;

import com.abhinavProjects.Model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static  final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    public JsonKafkaProducer jsonKafkaProducer;


    @KafkaListener( topics ="Names_Json")
    public void consume(User user){
        LOGGER.info(String.format("Message received in topic: Names_Json Message: %s",user.toString()));
    }
}

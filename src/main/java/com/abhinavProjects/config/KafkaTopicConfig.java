package com.abhinavProjects.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic nameTopic(){
        return TopicBuilder.name("Names")
                .build();
    }

    @Bean
    public NewTopic JsonNameTopic(){
        return TopicBuilder.name("Names_Json")
                .build();
    }
}

package com.abhinavProjects.controller;

import com.abhinavProjects.Model.User;
import com.abhinavProjects.kafka.JsonKafkaProducer;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    private JsonKafkaProducer jsonKafkaProducer;

    public JsonMessageController(JsonKafkaProducer jsonKafkaProducer) {
        this.jsonKafkaProducer = jsonKafkaProducer;
    }

    // http:localhost:8080/api/v1/kafka/publish
    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
        jsonKafkaProducer.sendMessage(user);
        return ResponseEntity.ok("JSON message sent to kafka topic");
    }
}

package com.example.kafkaexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessageToTopic(String message){
        for (int i = 0; i < 10000; i++) {
            kafkaTemplate.send("abhicode", message + " with iteration: " + i);
        }
    }
}

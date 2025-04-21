package com.example.kafkaexample.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "abhicode", groupId = "groupId")
    public void topicListener(String receivedMsg){
        System.out.println("Message received: 👍" + receivedMsg);
    }
}

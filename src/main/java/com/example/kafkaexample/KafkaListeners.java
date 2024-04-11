package com.example.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * This code defines a Kafka message listener component.
 */

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "abhicode",
            groupId = "groupId"
    )
    void listener(String data){

        System.out.println("Listener received: " + data);

    }
}

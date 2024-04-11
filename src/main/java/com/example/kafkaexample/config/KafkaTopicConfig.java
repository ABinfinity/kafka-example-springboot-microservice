package com.example.kafkaexample.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
  *  This class is responsible to build topics for kafka broker.
 **/
@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic abhiCodeTopic(){
        return TopicBuilder.name("abhicode").build();
    }
}

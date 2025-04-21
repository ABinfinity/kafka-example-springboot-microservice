package com.example.kafkaexample;

import com.example.kafkaexample.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("api/v2/messages")
public class MessageController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping("/sendToTopic")
    public ResponseEntity<String> publish(@RequestParam String message){
        kafkaProducer.sendMessageToTopic(message);

        return ResponseEntity.ok("Message sent to topic successfully.");

    }
}

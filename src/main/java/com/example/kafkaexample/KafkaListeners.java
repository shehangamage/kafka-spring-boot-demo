package com.example.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author Shehan
 */
@Component
public class KafkaListeners {

    @KafkaListener(topics = "signum-topic", groupId = "group_id")
    void listener(String message) {
        System.out.println("Message received: " + message);
    }

}

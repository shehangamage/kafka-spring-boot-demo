package com.example.kafkaexample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaExampleApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(KafkaTemplate<String, String> kafkaTemplate) {
//        return args -> {
//            for (int i = 0; i < 10; i++) {
//                kafkaTemplate.send("signum-topic", "Hello World " + i);
//            }
//        };
//    }

}

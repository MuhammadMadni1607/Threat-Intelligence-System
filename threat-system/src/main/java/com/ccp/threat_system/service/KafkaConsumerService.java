package com.ccp.threat_system.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "threat-topic", groupId = "threat-group")
    public void consume(String message) {
        System.out.println("🔥 Received from Kafka: " + message);
    }
}
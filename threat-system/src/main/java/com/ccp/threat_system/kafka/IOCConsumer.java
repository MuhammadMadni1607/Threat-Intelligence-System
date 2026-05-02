package com.ccp.threat_system.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class IOCConsumer {

    @KafkaListener(topics = "threat-topic", groupId = "threat-group")
    public void consume(String message) {
        System.out.println("🔥 Kafka Message Received: " + message);
    }
}
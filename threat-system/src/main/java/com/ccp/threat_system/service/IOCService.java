package com.ccp.threat_system.service;

import com.ccp.threat_system.entity.IOCData;
import com.ccp.threat_system.repository.IOCRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IOCService {

    @Autowired
    private IOCRepository repository;

    @Autowired
    private KafkaProducerService kafkaProducerService;

    private final ObjectMapper objectMapper = new ObjectMapper();

    public IOCData saveIOC(IOCData data) {

        IOCData saved = repository.save(data);

        try {
            String json = objectMapper.writeValueAsString(saved);
            kafkaProducerService.sendMessage("threat-topic", json);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return saved;
    }

    public List<IOCData> getAllIOC() {
        return repository.findAll();
    }
}
package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaService {
    private final Logger logger = LoggerFactory.getLogger(kafkaService.class);

    @KafkaListener(id = "listener1", topics = "quickstart-events")
    public void listener1(String data) {
        logger.info("Received from terminal listener1 : " + data);
    }

    @KafkaListener(id = "listener2", topics = "topic1")
    public void listener2(String data) {
        logger.info("Received from API : " + data);
    }
}

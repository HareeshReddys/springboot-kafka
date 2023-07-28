package com.example.springboot.Kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    // spring boot provided deafult logger for logger message

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

    public KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){
        LOGGER.info(String.format("message sent %s", message));
        kafkaTemplate.send("SpringKafka", message);

    }
}

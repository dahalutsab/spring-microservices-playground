package com.patient_management.patient_service.kafka;

import org.springframework.kafka.core.KafkaTemplate;

public class KafkaProducer {

    private final KafkaTemplate<String, byte[]> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, byte[]> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
}

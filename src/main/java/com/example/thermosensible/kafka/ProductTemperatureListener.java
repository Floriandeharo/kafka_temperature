package com.example.thermosensible.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.example.thermosensible.dto.ProductTemperatureEvent;
import com.example.thermosensible.service.AlertService;

@Component
public class ProductTemperatureListener {

    private final AlertService alertService;

    public ProductTemperatureListener(AlertService alertService) {
        this.alertService = alertService;
    }

    @KafkaListener(topics = "product-temp", groupId = "alert-group",
                   containerFactory = "kafkaListenerContainerFactory")
    public void listen(ProductTemperatureEvent event) {
        alertService.checkTemperature(event);
    }
}
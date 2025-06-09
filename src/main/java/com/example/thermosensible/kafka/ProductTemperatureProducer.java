package com.example.thermosensible.kafka;

import java.time.Instant;
import java.util.Random;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.thermosensible.dto.ProductTemperatureEvent;

@Component
public class ProductTemperatureProducer {

    private final KafkaTemplate<String, ProductTemperatureEvent> kafkaTemplate;
    private final Random random = new Random();

    public ProductTemperatureProducer(KafkaTemplate<String, ProductTemperatureEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Scheduled(fixedRate = 5000)
    public void sendTemperature() {
        ProductTemperatureEvent event = new ProductTemperatureEvent();
        event.setProductId("lot-" + random.nextInt(100));
        event.setContainerId("box-" + random.nextInt(10));
        event.setTemperature(Math.round((-18 + (new Random().nextDouble() * 28)) * 100.0) / 100.0);
        event.setTimestamp(Instant.now().getEpochSecond());

        kafkaTemplate.send("product-temp", event);
        System.out.println("Message produit : " + event);
    }
}
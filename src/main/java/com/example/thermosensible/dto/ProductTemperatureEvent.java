package com.example.thermosensible.dto;

import lombok.Data;

@Data
public class ProductTemperatureEvent {
    private String productId;
    private String containerId;
    private double temperature;
    private long timestamp;

    // Getters/Setters (ou Lombok @Data si tu l'as activé)
}
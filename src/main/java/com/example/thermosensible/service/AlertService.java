package com.example.thermosensible.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.thermosensible.dto.ProductTemperatureEvent;

@Service
public class AlertService {
    private final List<String> alerts = new ArrayList<>();

    public void checkTemperature(ProductTemperatureEvent event) {
        if (event.getTemperature() > 2.0) {
            String message = "ALERTE : " + event.getProductId() + " → " + event.getTemperature() + "°C";
            System.out.println(message);
            alerts.add(message);
        }
    }

    public List<String> getAlerts() {
        return alerts;
    }
}
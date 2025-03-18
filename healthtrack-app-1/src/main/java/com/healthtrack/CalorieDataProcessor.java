package com.healthtrack;

import java.util.HashMap;
import java.util.Map;

public class CalorieDataProcessor implements HealthDataProcessor {
    private Map<String, Integer> userData = new HashMap<>();

    @Override
    public void processUserData(String rawData) {
        String[] parts = rawData.split(",");
        for (String part : parts) {
            String[] keyValue = part.split(":");
            String key = keyValue[0].trim();
            int value = Integer.parseInt(keyValue[1].trim());
            userData.put(key, value);
        }
    }

    @Override
    public void displayResults() {
        System.out.println("Processed User Data:");
        for (Map.Entry<String, Integer> entry : userData.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public int calculateCalories() {
        int weight = userData.getOrDefault("Weight", 0);
        return (weight > 80) ? 1500 : (weight >= 50 ? 2000 : 2500);
    }
}
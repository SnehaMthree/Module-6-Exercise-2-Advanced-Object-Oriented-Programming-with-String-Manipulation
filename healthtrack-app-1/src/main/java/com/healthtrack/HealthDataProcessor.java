package com.healthtrack;

public interface HealthDataProcessor {
    void processUserData(String rawData);
    void displayResults();
}
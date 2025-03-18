package com.healthtrack;

public abstract class AdvancedCalorieProcessor extends CalorieDataProcessor {
    public abstract void calculateMacronutrients(int calories);

    public void displayAdvancedResults() {
        System.out.println("Advanced results include macronutrient details.");
    }
}

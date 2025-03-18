package com.healthtrack;

public class App {
    public static void main(String[] args) {
        // Calorie Data Processing
        MacronutrientProcessor processor = new MacronutrientProcessor();
        processor.processUserData("Weight:75,Calories:2000");
        processor.displayResults();

        int calories = processor.calculateCalories();
        processor.calculateMacronutrients(calories);

        // User Activity Data Analysis
        UserActivityAnalyzer<Integer> stepsAnalyzer = new UserActivityAnalyzer<>();
        stepsAnalyzer.addData(5000);
        stepsAnalyzer.addData(10000);
        stepsAnalyzer.addData(7500);

        System.out.println("Max Steps: " + stepsAnalyzer.getMax());
        System.out.println("Min Steps: " + stepsAnalyzer.getMin());
        System.out.println("Average Steps: " + stepsAnalyzer.getAverage());
    }
}
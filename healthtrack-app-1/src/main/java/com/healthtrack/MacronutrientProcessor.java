package com.healthtrack;

public class MacronutrientProcessor extends AdvancedCalorieProcessor {

    @Override
    public void calculateMacronutrients(int calories) {
        int protein = (int) (calories * 0.3 / 4);
        int carbs = (int) (calories * 0.5 / 4);
        int fats = (int) (calories * 0.2 / 9);

        System.out.println("Macronutrients Breakdown:");
        System.out.println("Protein (grams): " + protein);
        System.out.println("Carbs (grams): " + carbs);
        System.out.println("Fats (grams): " + fats);
    }
}
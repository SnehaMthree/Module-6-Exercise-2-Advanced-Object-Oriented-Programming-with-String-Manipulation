package com.healthtrack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalorieDataProcessorTest {

    @Test
    public void testCalculateCalories() {
        CalorieDataProcessor processor = new CalorieDataProcessor();
        processor.processUserData("Weight:75");
        assertEquals(2000, processor.calculateCalories());
    }
}

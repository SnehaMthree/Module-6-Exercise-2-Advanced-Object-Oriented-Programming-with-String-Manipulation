package com.healthtrack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UserActivityAnalyzerTest {

    @Test
    public void testAnalytics() {
        UserActivityAnalyzer<Integer> analyzer = new UserActivityAnalyzer<>();
        analyzer.addData(5000);
        analyzer.addData(10000);
        analyzer.addData(7500);

        assertEquals(10000, analyzer.getMax());
        assertEquals(5000, analyzer.getMin());
        assertEquals(7500, (int) analyzer.getAverage());
    }
}
package com.healthtrack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserActivityAnalyzer<T extends Number & Comparable<T>> { // Added Comparable<T>
    private List<T> activityData = new ArrayList<>();

    public void addData(T data) {
        activityData.add(data);
    }

    public T getMax() {
        return Collections.max(activityData); // No error now
    }

    public T getMin() {
        return Collections.min(activityData); // No error now
    }

    public double getAverage() {
        double sum = 0.0;
        for (T data : activityData) {
            sum += data.doubleValue();
        }
        return sum / activityData.size();
    }
}
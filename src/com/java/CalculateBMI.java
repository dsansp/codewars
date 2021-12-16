package com.java;

public class CalculateBMI {
    public static String bmi(double weight, double height) {

        double bmi = weight / Math.pow(height, 2.0f);
        if (bmi > 30) {
            return "Obese";
        } else if (bmi > 25.0f && bmi <= 30.0f) {
            return "Overweight";
        } else if (bmi > 18.5f && bmi <= 25.0f) {
            return "Normal";
        } else {
            return "Underweight";
        }
    }

}






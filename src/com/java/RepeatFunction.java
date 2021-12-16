package com.java;

public class RepeatFunction {
    public static String repeatStr(final int repeat, final String string) {
        String sum = "";
        for (int i = 0; i < repeat; i++) {
            sum += string;
        }
        return sum;
    }
}


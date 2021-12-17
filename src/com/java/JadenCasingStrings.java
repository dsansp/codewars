package com.java;

public class JadenCasingStrings {
    public String toJadenCase(String phrase) {
        if (phrase == null) {
            return null;
        }
        if (phrase.isEmpty()) {
            return null;
        }
        for (int i = 0; i < phrase.length(); i++) {
String before = phrase.substring(0,i);
String here = phrase.substring(i,i+1).toUpperCase();
String after = phrase.substring(i+1);
if (i==0 || phrase.substring(i-1, i).equals(" ")){
    phrase = before+here+after;
            }
        }
return phrase;
    }
}

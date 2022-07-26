package com.telran.berlin.homeworks;

public class Strings2 {
    public static void main(String[] args) {
        System.out.println(twoThreeSymbols("Hello"));
        System.out.println(doubleLn("Honorificabilitudinitatibus")); // Longest word in Shakespeare's works
        System.out.println(halfOfString("Satisfaction"));
        System.out.println(nonStart("First", "Second"));
        System.out.println(toEnd("abcd"));
        System.out.println(toStart("abcd"));
    }

    public static String twoThreeSymbols(String str) {
        return str.substring(1, 3);
    }

    public static int doubleLn(String str) {
        return str.length() * 2;
    }

    public static String halfOfString(String str) {
        return str.substring(0, str.length() / 2);
    }

    public static String nonStart(String str1, String str2) {
        return (str1.substring(1) + str2.substring(1)).toUpperCase();
    }

    public static String toEnd(String str) {
        return str.substring(1) + str.substring(0, 1);
    }

    public static String toStart(String str) {
        return str.substring(str.length() - 1) + str.substring(0, str.length() - 1);
    }
}

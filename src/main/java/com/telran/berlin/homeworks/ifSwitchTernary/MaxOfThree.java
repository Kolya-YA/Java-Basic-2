package com.telran.berlin.homeworks.ifSwitchTernary;

public class MaxOfThree {
    static String getMax(int a, int b, int c) {
        int maxByIf;

        if (a > b) {
            if (a > c) {
                maxByIf = a;
            } else {
                maxByIf = c;
            }
        } else {
            if (b > c) {
                maxByIf = b;
            } else {
                maxByIf = c;
            }
        }

        int maxByTernary = a > b ? a > c ? a : c : b > c ? b : c;

        return "Max form " + a + ", " + b + " and " + c + " by IF operator is: " + maxByIf + " and by ternary operator is: " + maxByTernary;
    }
}
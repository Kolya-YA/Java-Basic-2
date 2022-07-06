package com.telran.berlin.homeworks;

public class CliCalculator {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);
        String operation = args[1];

        if (!operation.equals("+") && !operation.equals("-")) {
            System.out.println("Wrong operation!");
            return;
        }

        int answer = operation.equals("+") ? a + b : a - b;
        System.out.println("Result: " + args[0] + " " + args[1] + " " + args[2] + " = " + answer);
    }
}

package com.telran.berlin.homeworks.extra;

import com.telran.berlin.Main;

import java.util.Random;

public class RandomAndSum {
    private static Random rnd = new Random();

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            rndTripleMax(rnd.nextInt(900) + 100);
        }

        System.out.print("\nPlease enter your lovely integer number: ");
        int inputNum = Main.scanner.nextInt();
        System.out.println("Sum of digits in " + inputNum + " is " + sumOfDigits(inputNum));
    }

    private static void rndTripleMax(int rndNum) {
        int a = rndNum / 100;
        int b = rndNum % 100 / 10;
        int c = rndNum % 10;
        int maxDigit = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("In " + rndNum + " max digit is " + maxDigit);
    }

    private static int sumOfDigits(int inputNum) {
        String inputStr = Integer.toString(inputNum);
        int resAcc = 0;

        for (int i = 0; i < inputStr.length(); i++) {
            resAcc += Character.getNumericValue(inputStr.charAt(i));
        }

        return resAcc;
    }
}

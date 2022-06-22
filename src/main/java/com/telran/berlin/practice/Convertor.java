package com.telran.berlin.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Convertor {

    static void calc() {
        int inputInt;
        int inputRadix;
        int targetRadix;
        int remainder;
        String answerStr;
        ArrayList<String> answerArr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radix (base) of integer number: ");
        try {
            inputRadix = sc.nextInt(10);
        } catch (Exception ex) {
            System.out.println("\nWrong input.");
            return;
        }

        System.out.print("Enter integer number: ");
        try {
            inputInt = sc.nextInt(inputRadix);
        } catch (Exception ex) {
            System.out.println("\nWrong input.");
            return;
        }

        System.out.print("Enter target radix (base): ");
        try {
            targetRadix = sc.nextInt(10);
        } catch (Exception ex) {
            System.out.println("\nWrong input.");
            return;
        }

        remainder = inputInt;
        while (remainder > 0 ) {
            answerArr.add(Integer.toString(remainder % targetRadix, targetRadix));
            remainder = remainder / targetRadix;
        }

        Collections.reverse(answerArr);
        answerStr = String.join("", answerArr);
        System.out.println("\nIt was: " + Integer.toString(inputInt, inputRadix).toUpperCase());
        System.out.println("\nIt was: " + inputInt);
        System.out.println("It's in new form: " + answerStr.toUpperCase());
    }
}

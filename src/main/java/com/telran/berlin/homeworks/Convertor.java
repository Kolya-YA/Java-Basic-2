package com.telran.berlin.homeworks;

import com.telran.berlin.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Convertor {
    public static void calc() {
        int inputInt;
        int inputRadix;
        int targetRadix;
        int remainder;
        String answerStr;
        String inputRadixStr = "Enter radix (base) of integer number:";
        String inputNumStr = "Enter integer number:";
        String targetRadixStr = "Enter target radix (base):";
        String wrongStr = "Wrong input.";

        ArrayList<String> answerArr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        inputRadix = intInput(10, inputRadixStr, wrongStr);
        inputInt = intInput(inputRadix, inputNumStr, wrongStr);
        targetRadix = intInput(10, targetRadixStr, wrongStr);

        remainder = inputInt;
        while (remainder > 0) {
            answerArr.add(Integer.toString(remainder % targetRadix, targetRadix));
            remainder = remainder / targetRadix;
        }

        Collections.reverse(answerArr);
        answerStr = String.join("", answerArr);

        System.out.println("\nIt was: " + Integer.toString(inputInt, inputRadix).toUpperCase() + " or in decimal " + inputInt);
        System.out.println("It's with new radix (base): " + answerStr.toUpperCase());
    }

    private static int intInput(int inputRadix, String enterStr, String errorStr) {

        System.out.print(enterStr + " ");

        try {
            return Main.SCANNER.nextInt(inputRadix);
        } catch (Exception ex) {
            System.out.println("\n" + errorStr);
            System.exit(1);
            throw ex;
        }
    }
}

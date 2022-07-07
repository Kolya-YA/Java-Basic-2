package com.telran.berlin.homeworks;

import com.telran.berlin.Main;

import java.util.Scanner;

public class TwoDigitCalc {
    public static void main() {
        final int BEST_FIRST = 500;
        final int BEST_SECOND = 125;

        int number1 = inputInt(1, BEST_FIRST);
        int number2 = inputInt(2, BEST_SECOND);

        String num1 = number1 == BEST_FIRST
                ? "" + number1 + " (it's my choice)"
                : "" + number1;
        String num2 = number2 == BEST_SECOND
                ? "" + number2 + " (it's my choice)"
                : "" + number2;

        System.out.println("\nnumber1 = " + num1 + "; number2 = " + num2);
        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
    }
    private static int inputInt(int intNumber, int bestInt) {
        String intWord = intNumber == 1 ? "first" : "second";

        System.out.print("\nPlease enter " + intWord + " number: ");

        if (Main.SCANNER.hasNextInt()) {
            return Main.SCANNER.nextInt();
        } else {
            Main.SCANNER.next();
            System.out.println("You entered the wrong number, but I know a better number for this case.\nThis is: " + bestInt);
            return bestInt;
        }
    }
}

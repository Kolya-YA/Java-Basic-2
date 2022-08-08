package com.telran.berlin.homeworks;

import com.telran.berlin.Main;

import java.util.Random;
import java.util.Scanner;

public class trueFalse {
        private static Random rnd = new Random();

    public static void main(String[] args) {
        boolean isWeekend = rnd.nextBoolean();
        boolean isRainy = rnd.nextBoolean();
        System.out.println(weekendWalk(isWeekend, isRainy)   + "\n");
        System.out.println(canBuy(true, true) + "\n");
        System.out.println(tempChecker(100, 100));
        System.out.println(tempChecker(101, 99) + "\n");
        System.out.print("\nPlease enter first number: ");
        int a = Main.scanner.nextInt();
        System.out.print("\nPlease enter second number: ");
        int b = Main.scanner.nextInt();
        System.out.print("\nPlease enter third number: ");
        int c = Main.scanner.nextInt();
        System.out.println(oneFromThree(a, b, c));
        System.out.println(cinemaChecker(8, 16));
        System.out.println(cinemaChecker(16, 16));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(1988));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2024));

    }

    private static String weekendWalk(boolean isWeekend, boolean isRainy) {
        boolean result = isWeekend && !isRainy;

        String weekendStr = "It's a " + (isWeekend ? "weekend" : "work day");
        String rainStr = " and it's" + (isRainy ? "" : " not") + " raining.";
        String resultStr = "So I'm" + (result ? "" : " not") + " going for a walk.";

        return weekendStr + rainStr + "\n" + resultStr;
    }

    private static String canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        return "I can buy the food It’s " + (isEdekaOpen || isReweOpen);
    }

    private static String tempChecker(int flaskTemp1, int flaskTemp2) {
        boolean isOk =  flaskTemp1 > 100 && flaskTemp2 < 100;
        return isOk + "\n" + (isOk ? "All right." : "Something went wrong.");
    }

    private static int oneFromThree(int a, int b, int c){
        return a > b ? (a > c ? a : c) : (b > c ? b : c);
    }

    private static String cinemaChecker(int age, int ageLimit){
        return age < ageLimit ? "Not allow": "Allow";
    }

    private static String isLeapYear(int year){
        //A year may be a leap year if it is evenly divisible by 4.
        //Years that are divisible by 100 (century years such as 1900 or 2000) cannot be leap years unless they are also divisible by 400.
        //(For this reason, the years 1700, 1800, and 1900 were not leap years, but the years 1600 and 2000 were.)
        boolean isLeap = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        return year + " is" + (isLeap  ? "" : " not") + " a leap year.";
    }
}

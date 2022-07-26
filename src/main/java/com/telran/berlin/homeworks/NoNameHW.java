package com.telran.berlin.homeworks;

import com.telran.berlin.Main;

public class NoNameHW {
    public static void main(String[] args) {
        System.out.println(twoHalves());
        System.out.println(add(6, 2));
        System.out.println(subtract(6, 2));
        System.out.println(multiply(6, 2));
        System.out.println(divide(6, 2));
        System.out.println(eurToUsd(100.50));
        System.out.println(caloriesCalc(28, 24) + " Cal");
    }

    static String twoHalves() {
        String[] words = {"first", "second"};

        for (int i = 0; i < words.length; i++) {
            System.out.print("\nPlease enter " + words[i] + " word: ");
            words[i] = Main.scanner.nextLine();
            if (words[i].length() % 2 == 1) {
                return "The length of the input word is odd.";
            }
        }

        String result = words[0].substring(0, words[0].length() / 2) + words[1].substring(words[1].length() / 2);
        return "\nMy answer is: " + result;
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    static double eurToUsd(double eur) {
        double exchangeRate = 1.0124; // 26/07/2022 https://www.ecb.europa.eu/
        double centEur = eur * 100;
        double centUsd = Math.round(centEur * exchangeRate);
        return centUsd / 100;
    }

    static int caloriesCalc(double firstDiameter, double secondDiameter) {
        double firstSquare = Math.PI * (firstDiameter / 2) * (firstDiameter / 2);
        double secondSquare = Math.PI * (secondDiameter / 2) * (secondDiameter / 2);
        return (int) Math.round((firstSquare - secondSquare) * 40);
    }
}

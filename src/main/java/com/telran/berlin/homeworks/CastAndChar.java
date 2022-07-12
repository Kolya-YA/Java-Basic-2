package com.telran.berlin.homeworks;

import com.telran.berlin.Main;

public class CastAndChar {
    public static void main(String[] args) {
        numsWithCups();
        stringFromChar();
        squirrel();
        System.out.println(firstChar("TelRan"));
    }

    public static void numsWithCups() {
        float num = 3.9f;
        String str = "cups";

        System.out.println((int) num + " " + str);
        System.out.println(Math.round(num) + " " + str);
    }

    public static void stringFromChar() {
        char[] letters = { ' ', 'h', 'e', 'l', 'o', 'n', 'i', 'k', 'a', 'y', '!' };
        System.out.println(
                "" +
                Character.toUpperCase(letters[1]) +
                letters[2] +
                letters[3] +
                letters[3] +
                letters[4] +
                letters[0] +
                Character.toUpperCase(letters[5]) +
                letters[6] +
                letters[7] +
                letters[4] +
                letters[3] +
                letters[8] +
                letters[9] +
                letters[10]
        );
    }

    public static void squirrel() {
        System.out.print("Enter N: ");
        int n = Main.scanner.nextInt();

        System.out.print("Enter M: ");
        int m = Main.scanner.nextInt();

        System.out.print("Enter K: ");
        int k = Main.scanner.nextInt();

        System.out.println(n * m >= k ? "Yes" : "No");
    }

    public static char firstChar(String str) {
        return str.charAt(0);
    }

}

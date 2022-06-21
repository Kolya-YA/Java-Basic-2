package com.telran.berlin.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Convertor {

    static void decToBin() {
        ArrayList<String> answerArr = new ArrayList<>();
        int a;
        int calc;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal integer number: ");

        try {
            a = sc.nextInt();
        } catch (Exception ex) {
            System.out.println("\nWrong input.");
            return;
        }

        calc = a;
        while (calc > 0 ) {
            answerArr.add(String.valueOf(calc % 2));
            calc = calc / 2;
        }

        Collections.reverse(answerArr);

        System.out.println("\nIt was: " + a);
        System.out.println("It's in binary form: 0b" + String.join("", answerArr));
    }
}

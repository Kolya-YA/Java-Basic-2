package com.telran.berlin.homeworks;

import com.telran.berlin.Main;

public class TwoHalfOfWord {
    public static void main(String[] args) {
        String oddErrStr = "The length of the input word is odd. Ciao!";

        System.out.print("\nPlease enter first word: ");
        String firstWord = Main.scanner.nextLine();
        if (!wordChecker(firstWord)) {
            System.out.println(oddErrStr);
            return;
        }

        System.out.print("\nPlease enter second word: ");
        String secondWord = Main.scanner.nextLine();
        if (!wordChecker(firstWord)) {
            System.out.println(oddErrStr);
            return;
        }

        String result = firstWord.substring(0, firstWord.length() / 2) + secondWord.substring(secondWord.length() / 2);

        System.out.println("\nMy answer is: " + result);
    }

    public static boolean wordChecker(String word) {

        // TODO add checker for only letter string (regexp)

        return word.length() % 2 == 0;
    }
}

package com.telran.berlin.homeworks;

import com.telran.berlin.Main;

import java.util.Random;

public class LogicalOperators {
    public static void main(String[] args) {
        Random rnd = new Random();

        System.out.println(firstLevel(rnd));

        System.out.println(secondLevel(rnd));
    }

    static String firstLevel(Random rnd) {
        // I can win when second random number is equal first random number
        // or bigger than half of the first number and is even.

        int limit = 100;
        int first = rnd.nextInt(limit);
        int second = rnd.nextInt(first + 1);
        String firstStr = "First number is: " + first + ".";
        String secondStr = "Second number is: " + second + ".";
        String infoStr = firstStr + "\n" + secondStr +"\n";
        if (second == first || second > first / 2 && second % 2 == 0) {
            return infoStr + "I'm a winner!";
        }
            return infoStr + "I'm a looser!";
    }

    static String secondLevel(Random rnd) {
        System.out.print("\nPlease enter number of students: ");
        int numberOfStudents = Main.scanner.nextInt();
        int rndStudent = rnd.nextInt(numberOfStudents) + 1;
        return "Total students: " + numberOfStudents + "\n" + "Random student: " + rndStudent;
    }
}

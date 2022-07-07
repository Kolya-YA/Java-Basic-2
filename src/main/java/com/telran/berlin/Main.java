package com.telran.berlin;

import com.telran.berlin.game.constant.ConsoleColors;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int taskNo;
        String[] tasks = new String[6];

        tasks[0] = "— #0 Elf game";
        tasks[1] = "— #1 Variables create & print";
        tasks[2] = "— #2 Cat create & print";
        tasks[3] = "— #3 Dog create & print";
        tasks[4] = "— #4 Numbers convertor";
        tasks[5] = "— #5 Two digit calculator";

        System.out.println(ConsoleColors.WHITE_BRIGHT + "\nJava homeworks!" + ConsoleColors.RESET);

        for (String task : tasks) {
            System.out.println(task);
        }

        try {
//            Scanner sc = new Scanner(System.in);
            System.out.print(ConsoleColors.WHITE_BRIGHT + "Choose task: " + ConsoleColors.RESET);
            taskNo = scanner.nextInt(10);
//            sc.close();
        } catch (Exception ex) {
            System.out.println("\nWrong task No!");
            System.exit(1);
            throw ex;
        }

        System.out.println();

        switch (taskNo) {
            case 0:
                Runner.gameRunner();  // Elf game
                break;
            case 1:
                Runner.varRunner(); // Variables create & print
                break;
            case 2:
                Runner.catRunner();  // Cat create & print
                break;
            case 3:
                Runner.dogRunner();  // Dog create & print
                break;
            case 4:
                Runner.convertorRunner();  // Number convertor
                break;
            case 5:
                Runner.twoDigitCalcRunner();  // Two digit calculator
                break;
            default:
                System.out.println("\nTask #" + taskNo + " isn't ready.");
        }
    }
}
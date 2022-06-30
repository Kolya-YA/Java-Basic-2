package com.telran.berlin;

import com.telran.berlin.game.constant.Constant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int taskNo;
        String[] tasks = new String[5];

        tasks[0] = "— #1 Variables create & print";
        tasks[1] = "— #2 Cat create & print";
        tasks[2] = "— #3 Dog create & print";
        tasks[3] = "— #4 Numbers convertor";
        tasks[4] = "— #5 Elf game";

        System.out.println(Constant.ConsoleColors.WHITE_BRIGHT + "\nJava homeworks!" + Constant.ConsoleColors.RESET);

        for (String task : tasks) {
            System.out.println(task);
        }

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print(Constant.ConsoleColors.WHITE_BRIGHT + "Choose task: " + Constant.ConsoleColors.RESET);
            taskNo = sc.nextInt(10);
        } catch (Exception ex) {
            System.out.println("\nWrong task No!");
            System.exit(1);
            throw ex;
        }

        System.out.println();

        switch (taskNo) {
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
                Runner.gameRunner();  // Elf game
                break;
            default:
                System.out.println("\nTask #" + taskNo + " isn't ready.");
        }
    }
}
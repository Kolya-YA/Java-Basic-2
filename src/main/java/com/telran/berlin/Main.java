package com.telran.berlin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int taskNo;
        String[] tasks = new String[4];

        tasks[0] = "— #1 Variables create & print";
        tasks[1] = "— #2 Cat create & print";
        tasks[2] = "— #3 Dog create & print";
        tasks[3] = "— #4 Numbers convertor";

        System.out.println("Java homeworks!\n—————");

        for (String task : tasks) {
            System.out.println(task);
        }

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("—————\nChoose task: ");
            taskNo = sc.nextInt(10);
        } catch (Exception ex) {
            System.out.println("\nWrong taskNo!");
            System.exit(1);
            throw ex;
        }

        System.out.println();

        switch (taskNo) {
            case 1: Runner.varRunner(); // Variables create & print
                    break;
            case 2: Runner.catRunner();  // Cat create & print
                    break;
            case 3: Runner.dogRunner();  // Dog create & print
                    break;
            case 4: Runner.convertorRunner();  // Number convertor
                    break;
            default: System.out.println("\nTask #" + taskNo + " isn't ready.");
        }
    }
}
package com.telran.berlin.homeworks;

import com.telran.berlin.Main;
import com.telran.berlin.game.constant.ConsoleColors;

public class Seasons {
    public static void main(String[] args) {
        int monthNo;
        int seasonNo;
        String[] seasons = { "winter", "spring", "summer", "fall" };
        String answer = "\nNo wait, I needed the number of the month!";

        System.out.print("\nGreetings! This is a session of calendar magic.\nI'm guessing the season by the number of the month.\nEnter the number of the month: ");

        if (!Main.scanner.hasNextInt()) {
            Main.scanner.next();
            System.out.println("\nNo, I need the number!");
            return;
        }

        monthNo = Main.scanner.nextInt();

        switch (monthNo) {
            case 1: case 2: case 12: // winter
                seasonNo = 0;
                break;
            case 3: case 4: case 5: // spring
                seasonNo = 1;
                break;
            case 6: case 7: case 8: // summer
                seasonNo = 2;
                break;
            case 9: case 10: case 11: // fall
                seasonNo = 3;
                break;
            default:
                seasonNo = -1;
                break;
        }

        if (seasonNo >= 0) {
            answer = "\nIt's the " + seasons[seasonNo] + " month.";
        }

        System.out.println(ConsoleColors.WHITE_BRIGHT + answer + ConsoleColors.RESET);
    }
}

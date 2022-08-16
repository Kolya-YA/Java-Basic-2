package com.telran.berlin.homeworks.lottery;

import com.telran.berlin.Main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Lottery {

    private final Random rnd = new Random();
    private int maxNum = 50;
    private int qtyNum = 5;
    private final HashSet<Integer> userNumbers = new HashSet<>();
    private final HashSet<Integer> winNumbers = new HashSet<>();

    public Lottery() {
    }

    // Customise lottery (not tested)
    public Lottery(int qtyNum, int maxNum) {
        this.maxNum = maxNum;
        this.qtyNum = qtyNum;
    }

    public void setUserNumbers() {
        for (int i = 0; i < this.qtyNum; i++) {
            int nextNum;
            do {
                System.out.print("Please enter your number #" + (i + 1) + " form 0 to " + maxNum + ": ");
                nextNum = Main.scanner.nextInt();
            } while (nextNum < 1 || nextNum > maxNum || !userNumbers.add(nextNum));
        }

        System.out.println("User numbers: " + getNumbers(false)); // this.getNumbers() ???
    }

    public void setWinNumbers() {
        for (int i = 0; i < this.qtyNum; i++) {
            int nextNum;
            do {
                nextNum = rnd.nextInt(maxNum) + 1;
            } while (!winNumbers.add(nextNum));
        }

        System.out.println("Winning numbers: " + this.getNumbers(true));
    }

    public void setWinNumbers(int r0, int r1, int r2, int r3, int r4) {
        this.winNumbers.addAll(Arrays.asList(r0, r1, r2, r3, r4));

        System.out.println("Winning numbers: " + this.getNumbers(true));
    }

    private String getNumbers(boolean isWinNumbers) {
        HashSet<Integer> numbersSet = isWinNumbers ? winNumbers : userNumbers;
        String result = "";

        for (int x: numbersSet) {
            result += " " + x + ",";
        }

        return result + "\b.";
    }
    public String getResult() {
        HashSet<Integer> result = new HashSet<>(winNumbers);
        result.retainAll(userNumbers);

        if (result.size() == 0) {
            return "\nWe're sorry, but you didn't win.";
        } else {
            return "\nCongratulations you have " + result.size() + " winning numbers: " + result;
        }
    }
}

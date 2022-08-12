package com.telran.berlin.homeworks.ifSwitchTernary;

import com.telran.berlin.Main;

public class ifSwitchTernary {
    public static void main(String[] args) {
        System.out.println(maxOfThree.getMax(19, 10, 1));

        System.out.println();
        System.out.println(priceCalc.getFinalPrice(100, 0));
        System.out.println(priceCalc.getFinalPrice(100, 1));
        System.out.println(priceCalc.getFinalPrice(100, 2));
        System.out.println(priceCalc.getFinalPrice(100, 3));

        System.out.println();
        System.out.print("Please enter No of month: ");
        int noOfMonth = Main.scanner.nextInt();

        System.out.println(monthByNo.getName(noOfMonth));
        System.out.println(nameOfSeason.getNameByIf(noOfMonth));
        System.out.println(nameOfSeason.getNameByTernary(noOfMonth));
    }
}

package com.telran.berlin.homeworks.ifSwitchTernary;

import com.telran.berlin.Main;

public class IfSwitchTernary {
    public static void main(String[] args) {
        System.out.println(MaxOfThree.getMax(19, 10, 1));

        System.out.println();
        System.out.println(PriceCalc.getFinalPrice(100, 0));
        System.out.println(PriceCalc.getFinalPrice(100, 1));
        System.out.println(PriceCalc.getFinalPrice(100, 2));
        System.out.println(PriceCalc.getFinalPrice(100, 3));

        System.out.println();
        System.out.print("Please enter No of month: ");
        int noOfMonth = Main.scanner.nextInt();

        System.out.println(MonthByNo.getName(noOfMonth));
        System.out.println(NameOfSeason.getNameByIf(noOfMonth));
        System.out.println(NameOfSeason.getNameByTernary(noOfMonth));
    }
}

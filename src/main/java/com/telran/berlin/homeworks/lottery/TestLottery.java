package com.telran.berlin.homeworks.lottery;

public class TestLottery {
    public static void main(String[] args) {
        Lottery newL01 = new Lottery();

        newL01.setUserNumbers();
        newL01.setWinNumbers(10, 20, 30, 40, 49);
        System.out.println(newL01.getResult());
    }
}

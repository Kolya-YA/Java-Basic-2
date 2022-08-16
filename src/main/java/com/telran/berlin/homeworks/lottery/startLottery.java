package com.telran.berlin.homeworks.lottery;

public class startLottery {
    public static void main(String[] args) {

        Lottery newL01 = new Lottery();

        newL01.setUserNumbers();
        newL01.setWinNumbers();
        System.out.println(newL01.getResult());
    }
}

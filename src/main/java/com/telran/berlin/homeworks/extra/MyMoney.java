package com.telran.berlin.homeworks.extra;
// снять деньги
//У вас на банковском счету N долларов. ВЫ хотите снять все, но банк разрешает снять только сумму, которая является делителем текущей суммы на счету и меньше текущей суммы.
//Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится, чтобы забрать все свои деньги из банка?
//Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
//
//Ввод:  N = 21
//Выход:  7
//Объяснение:  N = 21
//Снято 7, осталось = 14
//Снято 7, осталось = 7
//Снято 1, осталось = 6
//Снято 3, осталось = 3
//Снято 1, осталось = 2
//Снято 1, Осталось = 1
//Снято 1, осталось = 0

public class MyMoney {
    public static void main(String[] args) {
        System.out.println(getMyMoney(21));
        System.out.println(getMyMoney(100));
    }

    public static int getMyMoney(int sum) {
        int iteration = 0;
        System.out.println("Start sum: " + sum);
        while (sum > 0) {
            iteration++;

            if (sum % 2 == 0) {
                System.out.print("I'm taking: " + sum / 2 );
                sum /= 2;
            } else {
                int div = sum % 3 % 2 == 0 ? sum / 3 : sum / 3 - 1;

                while (div >= 0 && sum % div != 0) {
                    div -= 2;
                }
                System.out.print("I'm taking: " + Math.abs(div));
                sum -= Math.abs(div);
            }
            System.out.println(" \t\tCurrent balance: " + sum);
        }
        return iteration;
    }
}

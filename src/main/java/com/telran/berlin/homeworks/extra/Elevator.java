package com.telran.berlin.homeworks.extra;
// сломанный лифт
//лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж. Лифт сломан. Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем подьеме лифт превысил колличество этажей, то считается что лифт поднялся на самый верх. Найдите количество подьемов, которые понадобятся лифту.
//
//Ввод:
//H = 200, N = 50, M = 1
//Ответ: 5
//Объяснение:
//Первый подьем: 50 - 1 = 49
//Второй подьем: 49 + 50 - 1 = 98
//Третий подьем: 98 + 50 - 1 = 147
//Четвертый подьем: 147 + 50 - 1 = 196
//Пятый подьем: выйти за пределы H.
//
//реализовать метод numberOfLifts(int floor, int stepUp, int stepDown)

public class Elevator {
    public static void main(String[] args) {
        System.out.println("Answer: " + numberOfLifts(200, 50, 1));
        System.out.println("Answer: " + numberOfLifts(200, 50, 49));
    }

    private static int numberOfLifts(int floor, int stepUp, int stepDown) {
        int lQty = 0;
        int curFloor = 0;

        if (stepDown >= stepUp || floor == 0) {
            return -1; // Lifting impossible;
        }

        while (true) {
            lQty++;
            if (curFloor + stepUp >= floor) {
                return lQty;
            }
            curFloor += stepUp - stepDown;
        }
    }
}

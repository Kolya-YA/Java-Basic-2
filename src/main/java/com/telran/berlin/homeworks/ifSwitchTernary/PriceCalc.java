package com.telran.berlin.homeworks.ifSwitchTernary;

public class PriceCalc {

    static String getFinalPrice(int price, int qty) {
        int discount;

        return  qty < 1 ? "It's a pity. See you next time" :
                qty < 2 ? "Total price: $" + price * qty * 0.9 :
                            "Total price: $" + price * qty * 0.85;
    }
}

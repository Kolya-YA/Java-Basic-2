package com.telran.berlin.homeworks.ifSwitchTernary;

public class monthByNo {
    static String getName(int monthNo) {
        String preStr = "The name of month is: ";
        switch (monthNo) {
            case 1:
                return preStr + "January";
            case 2:
                return preStr + "February";
            case 3:
                return preStr + "March";
            case 4:
                return preStr + "April";
            case 5:
                return preStr + "May";
            case 6:
                return preStr + "June";
            case 7:
                return preStr + "July";
            case 8:
                return preStr + "August";
            case 9:
                return preStr + "September";
            case 10:
                return preStr + "October";
            case 11:
                return preStr + "November";
            case 12:
                return preStr + "December";
            default:
                return "Unacceptable number of month";
        }
    }

}

package com.telran.berlin.homeworks.ifSwitchTernary;

public class NameOfSeason {
    static String getNameByIf(int noOfMonth) {
        String preStr = "The name of season by IF operator is: ";
        String seasonName;

        if (noOfMonth > 0 && noOfMonth < 13) {
            if (noOfMonth < 3 || noOfMonth == 12) {
                seasonName = "Winter";
            } else if (noOfMonth < 6) {
                seasonName = "Spring";
            } else if (noOfMonth < 9) {
                seasonName = "Summer";
            } else {
                seasonName = "Fall";
            }
        } else {
            preStr = "";
            seasonName = "Unacceptable number of month";
        }

        return preStr + seasonName;
    }

    static String getNameByTernary(int noOfMonth) {
        String preStr = "The name of season by Ternary operator is: ";

        String seasonName = (noOfMonth >0 && noOfMonth < 13) ?
                                (noOfMonth < 3 || noOfMonth == 12) ? "Winter" :
                                (noOfMonth < 6) ? "Spring" :
                                (noOfMonth < 9) ? "Summer" :
                                                "Fall" :
                                    "Unacceptable number of month";

        return preStr + seasonName;
    }
}

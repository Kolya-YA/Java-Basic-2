package com.telran.berlin.homeworks;

import com.telran.berlin.game.constant.ConsoleColors;

public class Strings {
    public static void main(String[] args) {
        String javaStr = "I study Basic Java!"; // 1
        String javaSubstr = "Java";
        myStrMethod(javaStr, javaSubstr);                   // 2
    }

    public static void myStrMethod(String myStr , String mySubstr) {
        String boldStr = ConsoleColors.CYAN_BOLD_BRIGHT;
        String resetStr = ConsoleColors.RESET;
        System.out.println("Original string: " + boldStr + myStr + resetStr);
        System.out.println("Substring to find: " + boldStr + mySubstr + resetStr + "\n");

        System.out.println("Last symbol of original string is: " + boldStr + myStr.charAt(myStr.length() - 1) + resetStr);   // 3

        boolean contains = myStr.contains(mySubstr);              // 4
        System.out.println("Is original string contains \"" + boldStr + mySubstr + resetStr + "\" substring? " + boldStr + (contains ? "Yes" : "No") + resetStr);

        System.out.println("Original string with replaced characters: " + boldStr + myStr.replace('a', 'o') + resetStr);        // 5
        System.out.println("Uppercased string: " + boldStr + myStr.toUpperCase() + resetStr);      // 6
        System.out.println("Lowercased string: " + boldStr + myStr.toLowerCase() + resetStr);    // 7

        if (contains) {
            int startIdx = myStr.indexOf(mySubstr);
            int endIdx = startIdx + mySubstr.length();
            System.out.println("Extracted substring: " + boldStr + myStr.substring(startIdx, endIdx) + resetStr);                      // 8
            System.out.println("Original string without substring: " + boldStr + myStr.substring(0, startIdx) + myStr.substring(endIdx) + resetStr); // 8*
        }
    }
}

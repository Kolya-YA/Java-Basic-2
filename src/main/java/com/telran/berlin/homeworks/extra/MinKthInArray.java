package com.telran.berlin.homeworks.extra;

import java.util.Arrays;

public class MinKthInArray {
    public static void main(String[] args) {
        final int K = 4;
        int[] orgArr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        int[] copyOfArr = orgArr.clone();
        Arrays.sort(copyOfArr);

        int indexOf5thMin = -1;

        for (int i = 0; i < orgArr.length; i++) {
            if (orgArr[i] == K) {
                indexOf5thMin = i;
                break;
            }
        }

        System.out.print("Original array: ");
        for (int val : orgArr ) {
            System.out.print(val + ", ");
        }
        System.out.print("\b\b.\n\n");

        System.out.println("5th min value in Array: " + copyOfArr[4]);
        System.out.println("Index of " + copyOfArr[4] + " in original array: " + indexOf5thMin);
    }
}

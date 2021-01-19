package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a1 = {0, 2, 2};
        int[] a2 = {1, 3};

        int[] a3 = new int[a1.length + a2.length];

        int i = 0, j = 0, k = 0;
        while (k < (a3.length - 1)) {
            a3[k++] = a1[i] <= a2[j] ? (i < (a1.length - 1) ? a1[i++] : a1[i]) : (j < (a2.length - 1) ? a2[j++] : a2[j]);
        }
        a3[k] = a1[i] >= a2[j] ? a1[i] : a2[j];

        System.out.println(Arrays.toString(a3));
    }
}

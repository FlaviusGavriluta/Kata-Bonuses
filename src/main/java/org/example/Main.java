package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bonus(new int[]{22, 3, 15}, 18228)));
    }

    public static long[] bonus(int[] arr, long s) {

        double[] result = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = 1.0 / arr[i];
        }
        double sumOfInverseProportion = Arrays.stream(result).sum();

        long[] calculateBonuses = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            calculateBonuses[i] = (long) Math.round(result[i] / sumOfInverseProportion * s);
        }

        return calculateBonuses;
    }
}
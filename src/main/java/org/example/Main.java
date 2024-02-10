package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bonus(new int[]{22, 3, 15}, 18228)));
    }

    public static long[] bonus(int[] arr, long s) {
        double sum = Arrays.stream(arr).mapToDouble(e -> 1.0 / e).sum();
        return Arrays.stream(arr).mapToLong(e -> (long) Math.round(1.0 / e / sum * s)).toArray();
    }
}
package pl.urbanik.solution;

import java.util.*;

/**
 * Given an array of numbers and a number k, determine
 * if there are three entries in the array which add up to the specified number
 * k. For example, given [20, 303, 3, 4, 25] and k = 49, return true
 * as 20 + 4 + 25 = 49
 * */

public class DailyCodingProblem {

    public static boolean isTripletExist(int[] array, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {

                int val = k - (array[i] + array[j]);

                if (map.containsKey(val)) {
                    if (map.get(val) != i && map.get(val) != j) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arrayNumbers = {20, 303, 3, 4, 25};
        int k = 49;

        if (isTripletExist(arrayNumbers, k)) {
            System.out.println("Triplet exists");
        } else {
            System.out.println("Triplet doesn't exist");
        }
    }
}

package com.medium;

import java.util.Arrays;
import java.util.*;

public class Program15 {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, -4, 5, -6, 7, -8};
        
        rearrangeAlternately(array);
        
        System.out.println("Array after rearranging: " + Arrays.toString(array));
    }

    public static void rearrangeAlternately(int[] array) {
        // Two lists to hold positive and negative numbers
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        
        // Separate the positive and negative numbers
        for (int num : array) {
            if (num >= 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }
        
        // Pointers to the positive and negative lists
        int i = 0, j = 0, k = 0;
        
        // Iterate and place alternately from positive and negative
        while (i < positive.size() && j < negative.size()) {
            array[k++] = positive.get(i++);
            array[k++] = negative.get(j++);
        }
        
        // If there are remaining positive elements
        while (i < positive.size()) {
            array[k++] = positive.get(i++);
        }
        
        // If there are remaining negative elements
        while (j < negative.size()) {
            array[k++] = negative.get(j++);
        }
    }
}

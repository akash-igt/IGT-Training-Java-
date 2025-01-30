package com.medium;

import java.util.Arrays;

public class Program19 {
    public static void main(String[] args) {
        int[] array = {5, 3, 1, 4, 2, 6};
        
        rearrange(array);
        
        System.out.println("Rearranged array: " + Arrays.toString(array));
    }

    public static void rearrange(int[] array) {
        // Sort the array
        Arrays.sort(array);
        
        // Rearrange the elements
        for (int i = 1; i < array.length; i += 2) {
            // Swap elements at index i-1 and i
            if (i + 1 < array.length) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
    }
}

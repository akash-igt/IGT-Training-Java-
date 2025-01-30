package com.medium;

import java.util.Arrays;

public class Program6 {
    public static void main(String[] args) {
        int[] array = {0, 1, 9, 0, 3, 12, 0};
        
        moveZeroes(array);
        
        // Print the modified array
        System.out.print("Array after moving zeroes to the end: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void moveZeroes(int[] array) {
        int n = array.length;
        int nonZeroIndex = 0; // Pointer to track the position to place non-zero elements

        // Move all non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (array[i] != 0) {
                array[nonZeroIndex++] = array[i]; // Place the non-zero element at the current nonZeroIndex
            }
        }

        // Fill the remaining positions with zeroes
        while (nonZeroIndex < n) {
            array[nonZeroIndex++] = 0;
        }
    }
}

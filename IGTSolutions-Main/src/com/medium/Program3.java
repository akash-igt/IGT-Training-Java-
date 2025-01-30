package com.medium;

public class Program3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 9, 7};
        
        boolean isSorted = isArraySorted(array);
        
        if (isSorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }
    }

    public static boolean isArraySorted(int[] array) {
        // Iterate through the array and check if each element is less than or equal to the next element
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false; // If the current element is greater than the next, the array is not sorted
            }
        }
        return true; // If no such pair is found, the array is sorted
    }
}

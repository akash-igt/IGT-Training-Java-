package com.medium;

import java.util.Arrays;

public class Program4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 4, 3, 5, 6, 7, 8};
        
        int longestLength = findLongestIncreasingSubarray(array);
        
        System.out.println("Length of the longest increasing subarray: " + longestLength);
    }

    public static int findLongestIncreasingSubarray(int[] array) {
        if (array.length == 0) {
            return 0; // If the array is empty, there is no subarray
        }
        
        int maxLength = 1; // Minimum length of an increasing subarray is 1 (the first element itself)
        int currentLength = 1; // Start with the first element
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                currentLength++; // If the current element is greater, it's part of the increasing subarray
            } else {
                maxLength = Math.max(maxLength, currentLength); // Update max length if needed
                currentLength = 1; // Reset the current length
            }
        }
        
        // Check for the last increasing subarray
        maxLength = Math.max(maxLength, currentLength);
        
        return maxLength;
    }
}

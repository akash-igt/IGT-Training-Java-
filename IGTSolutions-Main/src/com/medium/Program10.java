package com.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Program10 {
    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        int maxSum = findMaxSubarraySum(array);
        
        System.out.println("Maximum sum of a subarray: " + maxSum);
    }

    public static int findMaxSubarraySum(int[] array) {
        // Initialize variables to track the current subarray sum and the maximum sum
        int maxEndingHere = array[0];  // The maximum sum of subarray ending at the current index
        int maxSoFar = array[0];       // The global maximum sum encountered so far
        
        // Iterate through the array from the second element
        for (int i = 1; i < array.length; i++) {
            // Update the maxEndingHere by either starting a new subarray at array[i] or adding array[i] to the current subarray
            maxEndingHere = Math.max(array[i], maxEndingHere + array[i]);
            
            // Update maxSoFar to track the overall maximum sum
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        
        return maxSoFar;
    }
}

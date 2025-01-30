package com.medium;

import java.util.Arrays;

public class Program13 {
    public static void main(String[] args) {
        int[] array = {12, 3, 5, 7, 19};
        int k = 2;  // Find the 2nd smallest element
        
        int kthSmallest = findKthSmallest(array, k);
        
        System.out.println("The " + k + "th smallest element is: " + kthSmallest);
    }

    public static int findKthSmallest(int[] array, int k) {
        // Sort the array
        Arrays.sort(array);
        
        // Return the k-th smallest element (index k-1)
        return array[k - 1];
    }
}

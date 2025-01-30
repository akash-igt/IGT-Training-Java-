package com.medium;

import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        int[] array = {1, 10, -5, 1, -100};
        
        int maxProduct = findMaximumProduct(array);
        
        System.out.println("Maximum product of two elements: " + maxProduct);
    }

    public static int findMaximumProduct(int[] array) {
        if (array.length < 2) {
            return 0; // If there are less than two elements, no product is possible
        }
        
        int max1 = Integer.MIN_VALUE; // First largest element
        int max2 = Integer.MIN_VALUE; // Second largest element
        int min1 = Integer.MAX_VALUE; // First smallest element
        int min2 = Integer.MAX_VALUE; // Second smallest element
        
        // Iterate through the array to find the two largest and two smallest elements
        for (int num : array) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
            
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        
        // The maximum product is the greater of the product of the two largest or two smallest elements
        return Math.max(max1 * max2, min1 * min2);
    }
}

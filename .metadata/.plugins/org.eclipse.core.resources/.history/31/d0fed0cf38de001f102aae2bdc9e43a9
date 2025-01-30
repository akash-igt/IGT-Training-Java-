package com.medium;

import java.util.HashSet;

public class Program20 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {2, 3, 4};

        boolean isSubset = isSubset(array1, array2);
        
        if (isSubset) {
            System.out.println("array2 is a subset of array1.");
        } else {
            System.out.println("array2 is not a subset of array1.");
        }
    }

    public static boolean isSubset(int[] array1, int[] array2) {
        // Create a HashSet to store elements of array1
        HashSet<Integer> set = new HashSet<>();
        
        // Add all elements of array1 to the HashSet
        for (int num : array1) {
            set.add(num);
        }
        
        // Check if each element of array2 is present in the HashSet
        for (int num : array2) {
            if (!set.contains(num)) {
                return false;  // If any element is not found, it's not a subset
            }
        }
        
        return true;  // If all elements are found, it's a subset
    }
}

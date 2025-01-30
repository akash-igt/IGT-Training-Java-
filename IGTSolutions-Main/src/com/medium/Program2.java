package com.medium;

import java.util.HashSet;
import java.util.Set;

public class Program2 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        
        Set<Integer> union = findUnion(array1, array2);
        
        System.out.println("Union: " + union);
    }

    public static Set<Integer> findUnion(int[] array1, int[] array2) {
        Set<Integer> union = new HashSet<>();
        
        // Add elements from the first array to the set
        for (int num : array1) {
            union.add(num);
        }
        
        // Add elements from the second array to the set
        for (int num : array2) {
            union.add(num);
        }
        
        return union;
    }
}

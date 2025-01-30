package com.medium;
import java.util.HashSet;
import java.util.Set;

public class Program1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        
        Set<Integer> intersection = findIntersection(array1, array2);
        
        System.out.println("Intersection: " + intersection);
    }

    public static Set<Integer> findIntersection(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        
        // Add elements of the first array to the set
        for (int num : array1) {
            set1.add(num);
        }
        
        // Check if elements of the second array are in the set
        for (int num : array2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }
        
        return intersection;
    }
}

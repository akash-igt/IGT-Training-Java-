package com.medium;

import java.util.Arrays;
import java.util.Collections;

import java.util.HashSet;

public class Program8 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 4, 3, 5, 6};
        
        int firstRepeatingElement = findFirstRepeatingElement(array);
        
        if (firstRepeatingElement != -1) {
            System.out.println("First repeating element: " + firstRepeatingElement);
        } else {
            System.out.println("No repeating elements found.");
        }
    }

    public static int findFirstRepeatingElement(int[] array) {
        HashSet<Integer> seenElements = new HashSet<>();
        
        // Iterate through the array
        for (int num : array) {
            // If the number is already in the set, it's a repeating element
            if (seenElements.contains(num)) {
                return num;
            }
            // Otherwise, add the number to the set
            seenElements.add(num);
        }
        
        // Return -1 if no repeating element is found
        return -1;
    }
}

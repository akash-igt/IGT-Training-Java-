package com.medium;
import java.util.HashMap;

public class Program9 {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 4, 5, 7, 8};
        
        int firstNonRepeatingElement = findFirstNonRepeatingElement(array);
        
        if (firstNonRepeatingElement != -1) {
            System.out.println("First non-repeating element: " + firstNonRepeatingElement);
        } else {
            System.out.println("No non-repeating elements found.");
        }
    }

    public static int findFirstNonRepeatingElement(int[] array) {
        // HashMap to store the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        // First pass: Count the frequency of each element
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Second pass: Find the first element with frequency 1 (non-repeating)
        for (int num : array) {
            if (frequencyMap.get(num) == 1) {
                return num;
            }
        }
        
        // Return -1 if no non-repeating element is found
        return -1;
    }
}

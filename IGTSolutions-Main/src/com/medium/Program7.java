package com.medium;

import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;

public class Program7 {
    public static void main(String[] args) {
        int[] array = {1, 5, 7, -1, 5};
        int targetSum = 6;
        
        int count = countPairsWithSum(array, targetSum);
        
        System.out.println("Number of pairs with sum " + targetSum + ": " + count);
    }

    public static int countPairsWithSum(int[] array, int targetSum) {
        Map<Integer, Integer> map = new HashMap<>();
        int pairCount = 0;
        
        for (int num : array) {
            int complement = targetSum - num;
            
            // If the complement exists in the map, it means we've found a pair
            if (map.containsKey(complement)) {
                pairCount += map.get(complement);
            }
            
            // Add the current element to the map, or update its frequency
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        return pairCount;
    }
}

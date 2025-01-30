package com.medium;

import java.util.Arrays;

import java.util.*;

public class Program16 {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80};
        
        List<Integer> commonElements = findCommonElements(arr1, arr2, arr3);
        
        System.out.println("Common elements: " + commonElements);
    }

    public static List<Integer> findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> result = new ArrayList<>();
        
        int i = 0, j = 0, k = 0;
        
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            // If elements in all three arrays are the same
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                result.add(arr1[i]);
                i++;
                j++;
                k++;
            }
            // If element in arr1 is smaller, move pointer in arr1
            else if (arr1[i] < arr2[j]) {
                i++;
            }
            // If element in arr2 is smaller, move pointer in arr2
            else if (arr2[j] < arr3[k]) {
                j++;
            }
            // If element in arr3 is smaller, move pointer in arr3
            else {
                k++;
            }
        }
        
        return result;
    }
}

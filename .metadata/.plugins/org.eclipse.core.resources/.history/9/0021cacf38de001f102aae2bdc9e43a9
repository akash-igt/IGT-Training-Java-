package com.medium;

import java.util.HashMap;
import java.util.Map;
public class Program11 {
    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        int target = 7;
        
        int index = binarySearch(sortedArray, target);
        
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2; // Find the middle index
            
            // Check if the target is present at mid
            if (array[mid] == target) {
                return mid;
            }
            
            // If target is greater than mid, ignore left half
            if (array[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller than mid, ignore right half
            else {
                right = mid - 1;
            }
        }
        
        // Target is not present in the array
        return -1;
    }
}

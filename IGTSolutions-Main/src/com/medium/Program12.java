package com.medium;

public class Program12 {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6}; // Missing number is 3
        
        int missingNumber = findMissingNumber(array);
        
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] array) {
        int n = array.length + 1; // Total number of elements if none were missing
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;
        
        // Calculate the sum of the elements in the array
        for (int num : array) {
            actualSum += num;
        }
        
        // The missing number is the difference between the expected and actual sums
        return expectedSum - actualSum;
    }
}



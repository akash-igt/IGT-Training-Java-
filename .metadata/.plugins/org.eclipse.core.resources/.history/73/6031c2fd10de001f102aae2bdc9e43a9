package com.easy;

public class Program17 {
    public static void main(String[] args) {
        // Sample array
        int[] array = {5, 2, 8, 3, 6, 7, 10};

        // Call the method to find the difference
        int difference = findDifference(array);

        // Print the result
        System.out.println("Difference between largest and smallest elements: " + difference);
    }

    public static int findDifference(int[] array) {
        // Initialize min and max values
        int min = array[0];
        int max = array[0];

        // Iterate through the array to find min and max
        for (int num : array) {
            if (num < min) {
                min = num;  // Update min if a smaller number is found
            }
            if (num > max) {
                max = num;  // Update max if a larger number is found
            }
        }

        // Return the difference between max and min
        return max - min;
    }
}

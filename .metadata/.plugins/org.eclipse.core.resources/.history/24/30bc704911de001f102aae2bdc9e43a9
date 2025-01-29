package com.easy;

import java.util.Arrays;

public class Program4 {

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Original Array: " + Arrays.toString(arr));

        reverseArray(arr);

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}

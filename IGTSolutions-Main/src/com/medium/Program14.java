package com.medium;

import java.util.PriorityQueue;

public class Program14 {
    public static void main(String[] args) {
        int[] array = {12, 3, 5, 7, 19};
        int k = 2;  // Find the 2nd largest element
        
        int kthLargest = findKthLargest(array, k);
        
        System.out.println("The " + k + "th largest element is: " + kthLargest);
    }

    public static int findKthLargest(int[] array, int k) {
        // Min-heap to store the k largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // Add the first k elements to the heap
        for (int i = 0; i < k; i++) {
            minHeap.add(array[i]);
        }
        
        // Process the rest of the elements in the array
        for (int i = k; i < array.length; i++) {
            // If current element is larger than the smallest element in the heap
            if (array[i] > minHeap.peek()) {
                minHeap.poll();  // Remove the smallest element
                minHeap.add(array[i]);  // Add the current element
            }
        }
        
        // The root of the heap is the kth largest element
        return minHeap.peek();
    }
}

package com.medium;

public class Program18 {
    public static void main(String[] args) {
        int[] array = {3, 1, 3, 3, 2, 3, 3};
        
        int majorityElement = findMajorityElement(array);
        
        if (majorityElement != -1) {
            System.out.println("Majority element: " + majorityElement);
        } else {
            System.out.println("No majority element");
        }
    }

    public static int findMajorityElement(int[] array) {
        int candidate = findCandidate(array);
        
        // Verify if the candidate is actually the majority element
        if (isMajority(array, candidate)) {
            return candidate;
        }
        
        return -1;  // No majority element
    }

    // Function to find the candidate using Boyer-Moore Voting Algorithm
    private static int findCandidate(int[] array) {
        int count = 0, candidate = -1;
        
        for (int num : array) {
            if (count == 0) {
                candidate = num;
            }
            
            count += (num == candidate) ? 1 : -1;
        }
        
        return candidate;
    }

    // Function to verify if the candidate is the majority element
    private static boolean isMajority(int[] array, int candidate) {
        int count = 0;
        
        for (int num : array) {
            if (num == candidate) {
                count++;
            }
        }
        
        return count > array.length / 2;
    }
}

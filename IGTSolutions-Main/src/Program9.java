public class Program9 {
    public static void main(String[] args) {
        // Sample array
        int[] array = {5, 2, 8, 1, 3};

        // Call the method to find the second largest element
        int secondLargest = findSecondLargest(array);

        // Print the second largest element
        System.out.println("Second largest element is: " + secondLargest);
    }

    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE; // Initialize the largest element to the smallest possible value
        int secondLargest = Integer.MIN_VALUE; // Initialize the second largest element

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest; // Update second largest
                largest = num; // Update largest
            } else if (num > secondLargest && num < largest) {
                secondLargest = num; // Update second largest if it's between largest and the current number
            }
        }

        return secondLargest;
    }
}


// also find the third larget element 
// also find the X element in the array , where x is user enterd value

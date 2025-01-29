
public class Program12 {
    public static void main(String[] args) {
        // Sample array
        int[] array = {5, 2, 8, 3, 6, 7, 10};

        // Call the method to print even numbers
        printEvenNumbers(array);
    }

    public static void printEvenNumbers(int[] array) {
        System.out.println("Even numbers in the array:");
        for (int num : array) {
            if (num % 2 == 0) {  // Check if the number is even
                System.out.println(num);
            }
        }
    }
}

// pring all even numbers
// print all multiples of 5 
// print all the number whose reminder is 3 from 1 - 500



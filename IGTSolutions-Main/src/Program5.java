import java.util.Scanner;

public class Program5 {

    // Method to check if an array contains a specific value
    public static boolean containsValue(int[] arr, int value) {
        for (int num : arr) {
            if (num == value) {
                return true;  // Return true if value is found
            }
        }
        return false;  // Return false if value is not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value to TO FIND ? ");
        int valueToFind = sc.nextInt();

        boolean result = containsValue(arr, valueToFind);

        if (result) {
            System.out.println("The array contains the value: " + valueToFind);
        } else {
            System.out.println("The array does not contain the value: " + valueToFind);
        }
    }
}

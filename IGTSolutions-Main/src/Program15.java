
import java.util.Arrays;

public class Program15 {
    public static void main(String[] args) {
        // Sample arrays
        int[] array1 = {5, 2, 8, 3, 6};
        int[] array2 = {5, 2, 8, 3, 6};
        
        // Check if the arrays are equal
        boolean result = areArraysEqual(array1, array2);
        
        // Print the result
        if (result) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
    }

    public static boolean areArraysEqual(int[] array1, int[] array2) {
        // Check if arrays are of the same length
        if (array1.length != array2.length) {
            return false;
        }

        // Compare corresponding elements
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;  // Arrays are not equal if any element is different
            }
        }

        return true;  // Arrays are equal if all checks passed
    }
}

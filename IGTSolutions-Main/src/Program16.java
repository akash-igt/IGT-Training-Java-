
import java.util.Arrays;

public class Program16 {
    public static void main(String[] args) {
        // Sample arrays
        int[] array1 = {5, 2, 8};
        int[] array2 = {3, 6, 7, 10};

        // Merge the arrays
        int[] mergedArray = mergeArrays(array1, array2);

        // Print the merged array
        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        // Create a new array to hold the merged result
        int[] mergedArray = new int[array1.length + array2.length];

        // Copy elements from array1 to mergedArray
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);

        // Copy elements from array2 to mergedArray
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        return mergedArray;
    }
}

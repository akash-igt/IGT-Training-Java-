
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Program10 {
    public static void main(String[] args) {
        // Sample array with duplicates
        int[] array = {5, 2, 8, 2, 3, 5, 1};

        // Call the method to remove duplicates
        int[] result = removeDuplicates(array);

        // Print the array after removing duplicates
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] array) {
        // Create a set to store unique elements
        Set<Integer> set = new HashSet<>();

        // Add elements from the array to the set (duplicates are automatically removed)
        for (int num : array) {
            set.add(num);
        }

        // Convert the set back to an array
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }
}
class Program101
{
	void withoutusingSet()
	{
		  // Sample array with duplicates
        int[] array = {5, 2, 8, 2, 3, 5, 1};

        // Call the method to remove duplicates
        int[] result = removeDuplicatesManually(array);

        // Print the array after removing duplicates
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }

    public static int[] removeDuplicatesManually(int[] array) {
        // First, sort the array
        Arrays.sort(array);

        // Count how many unique elements there are
        int uniqueCount = 1;  // There's at least one unique element
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                uniqueCount++;
            }
        }

        // Create a new array to store unique elements
        int[] uniqueArray = new int[uniqueCount];
        int index = 0;

        // Add the unique elements to the new array
        uniqueArray[index++] = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                uniqueArray[index++] = array[i];
            }
        }

        return uniqueArray;
    }
	

}

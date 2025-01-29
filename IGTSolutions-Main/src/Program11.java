
import java.util.HashMap;
import java.util.Map;

public class Program11 {
    public static void main(String[] args) {
        // Sample array
        int[] array = {5, 2, 8, 2, 3, 5, 1};

        // Call the method to find the frequency of each element
        findFrequency(array);
    }

    public static void findFrequency(int[] array) {
        // Create a HashMap to store element and its frequency
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate through the array and count the frequency of each element
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print the frequency of each element
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + " | Frequency: " + entry.getValue());
        }
    }
}

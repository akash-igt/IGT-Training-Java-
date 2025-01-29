
public class Program2 {

    public static int findLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        int largest = arr[0]; // Assume the first element is the largest
        for (int num : arr) {
            if (num > largest) {
                largest = num; // Update largest if a larger element is found
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, 6, 10, 1, 4};

        int largest = findLargest(arr);
        System.out.println("The largest element in the array is: " + largest);
    }
}

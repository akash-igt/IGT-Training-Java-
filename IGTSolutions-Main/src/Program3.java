
public class Program3 {

    public static int findSmallest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        int smallest = arr[0]; // Assume the first element is the smallest
        for (int num : arr) {
            if (num < smallest) {
                smallest = num; // Update smallest if a smaller element is found
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, 6, 10, 1, 4};

        int smallest = findSmallest(arr);
        System.out.println("The smallest element in the array is: " + smallest);
    }
}

public class Program19 {
    public static void main(String[] args) {
        // Sample array
        int[] array = {5, 2, 8, 3, 6};

        // Rotate the array by one position to the right
        rotateArrayRight(array);

        // Print the rotated array
        System.out.println("Array after rotation: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void rotateArrayRight(int[] array) {
        // If the array is empty or has only one element, no rotation is needed
        if (array == null || array.length <= 1) {
            return;
        }

        // Store the last element
        int lastElement = array[array.length - 1];

        // Shift all elements to the right by one position
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        // Move the last element to the first position
        array[0] = lastElement;
    }
}

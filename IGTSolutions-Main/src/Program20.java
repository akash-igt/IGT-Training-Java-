public class Program20 {
    public static void main(String[] args) {
        // Sample array
        int[] array = {5, 2, 8, 3, 6};

        // Rotate the array by one position to the left
        rotateArrayLeft(array);

        // Print the rotated array
        System.out.println("Array after left rotation: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void rotateArrayLeft(int[] array) {
        // If the array is empty or has only one element, no rotation is needed
        if (array == null || array.length <= 1) {
            return;
        }

        // Store the first element
        int firstElement = array[0];

        // Shift all elements to the left by one position
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        // Move the first element to the last position
        array[array.length - 1] = firstElement;
    }
}

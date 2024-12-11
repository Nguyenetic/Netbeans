
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Test array
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        Main.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0]; // Assume the first element is the smallest
        for (int number : array) {
            if (number < smallest) {
                smallest = number; // Update smallest if a smaller value is found
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0; // Start with the first element as the smallest
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i; // Loop to iterate through the list to find the smallest value
                // and update once found
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex; // Start searching from the provided index
        for (int i = startIndex + 1; i < table.length; i++) {
            if (table[i] < table[index]) {
                index = i; // Update the index if a smaller value is found
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {

        int temp = array[index1]; // Store the value at index1 in a temporary variable

        array[index1] = array[index2]; // Assign the value at index2 to index1

        array[index2] = temp;  // Assign the value in temp (original index1 value) to index2
    }

    public static void sort(int[] array) {
        // Print the initial state of the array
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            // Find the index of the smallest number from index `i` onwards
            int smallestIndex = indexOfSmallestFrom(array, i);

            // Swap the number at index `i` with the smallest number found
            swap(array, i, smallestIndex);

            // Print the array after every iteration to observe the sorting progress
            System.out.println(Arrays.toString(array));
        }
    }
}


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] numbers = {3, 1, 5, 99, 3, 12};

        System.out.println("Index of the smallest number: " + indexOfSmallest(numbers));

        System.out.println(Arrays.toString(numbers));

        Main.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        Main.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
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
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    // Method to sort an array of integers
    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    // Method to sort an array of strings
    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    // Method to sort a list of integers
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    // Method to sort a list of strings
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

    public static void main(String[] args) {
        // Test sorting an array of integers
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        sort(numbers);
        System.out.println("Sorted integers array: " + Arrays.toString(numbers));

        // Test sorting an array of strings
        String[] words = {"banana", "apple", "orange", "kiwi"};
        sort(words);
        System.out.println("Sorted strings array: " + Arrays.toString(words));

        // Test sorting a list of integers
        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(8, 3, 7, 9, 1, 2, 4));
        sortIntegers(integerList);
        System.out.println("Sorted integers list: " + integerList);

        // Test sorting a list of strings
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("banana", "apple", "orange", "kiwi"));
        sortStrings(stringList);
        System.out.println("Sorted strings list: " + stringList);
    }
}

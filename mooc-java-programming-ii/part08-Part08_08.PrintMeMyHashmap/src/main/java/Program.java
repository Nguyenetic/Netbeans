
import java.util.HashMap;

/**
 * This class demonstrates working with HashMaps in Java by
 * performing operations such as printing keys, filtering keys,
 * and printing values based on specific conditions.
 */
public class Program {

    /**
     * The main method to demonstrate the functionality of HashMap operations.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a HashMap to store abbreviations and their explanations
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        // Print all keys in the HashMap
        printKeys(hashmap);
        System.out.println("---");

        // Print keys containing the letter 'i'
        printKeysWhere(hashmap, "i");
        System.out.println("---");

        // Print values of keys containing the substring ".e"
        printValuesOfKeysWhere(hashmap, ".e");
    }

    /**
     * Prints all the keys in the given HashMap.
     * @param hashmap The HashMap whose keys are to be printed.
     */
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    /**
     * Prints all the keys in the given HashMap that contain the specified substring.
     * @param hashmap The HashMap whose keys are to be filtered and printed.
     * @param text The substring to search for in the keys.
     */
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    /**
     * Prints the values associated with keys in the given HashMap that contain the specified substring.
     * @param hashmap The HashMap whose values are to be printed.
     * @param text The substring to search for in the keys.
     */
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }
}
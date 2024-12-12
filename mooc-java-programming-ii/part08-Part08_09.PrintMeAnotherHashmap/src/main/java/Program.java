
import java.util.HashMap;

public class Program {

    // Prints all the Book objects in the given hashmap
    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println(book);
        }
    }

    // Prints books whose names contain the specified text
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book book : hashmap.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        // Create a hashmap and add sample books
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        // Print all books in the hashmap
        printValues(hashmap);
        System.out.println("---");

        // Print books with names containing "prejud"
        printValueIfNameContains(hashmap, "prejud");
    }
}

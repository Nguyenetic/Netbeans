

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        
     System.out.println("Index of the smallest number: " + indexOfSmallest(array));
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
        for (int i = 1; i < array.length; i++){
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
}
    
    



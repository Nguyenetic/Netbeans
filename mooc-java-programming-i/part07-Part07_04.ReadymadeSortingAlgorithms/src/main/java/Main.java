

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        
     System.out.println("Index of the smallest number: " + indexOfSmallest(array));
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

}

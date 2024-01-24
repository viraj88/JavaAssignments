import java.util.ArrayList;

public class InsertAtFirstPositionExample {
    public static void main(String[] args) {
        // Create an ArrayList to store elements
        ArrayList<String> fruitsList = new ArrayList<>();

        // Add some fruits to the ArrayList
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Orange");
        fruitsList.add("Mango");

        // Print the ArrayList before insertion
        System.out.println("Before insertion:");
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }

        // Insert an element at the first position
        String newFruit = "Grapes";
        fruitsList.add(0, newFruit);

        // Print the ArrayList after insertion
        System.out.println("\nAfter insertion at the first position:");
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }
    }
}

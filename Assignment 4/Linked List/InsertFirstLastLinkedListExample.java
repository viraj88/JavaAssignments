import java.util.LinkedList;

public class InsertFirstLastLinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList to store elements
        LinkedList<String> fruitsList = new LinkedList<>();

        // Add some fruits to the LinkedList
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Orange");

        // Print the LinkedList before insertion
        System.out.println("Before insertion:");
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }

        // Insert a new fruit at the first position
        String newFirstFruit = "Grapes";
        fruitsList.addFirst(newFirstFruit);

        // Insert a new fruit at the last position
        String newLastFruit = "Watermelon";
        fruitsList.addLast(newLastFruit);

        // Print the LinkedList after insertion
        System.out.println("\nAfter insertion at the first and last positions:");
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }
    }
}

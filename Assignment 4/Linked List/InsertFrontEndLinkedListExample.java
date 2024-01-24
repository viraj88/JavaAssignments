import java.util.LinkedList;

public class InsertFrontEndLinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList to store elements
        LinkedList<String> colorsList = new LinkedList<>();

        // Add some colors to the LinkedList
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Blue");

        // Print the LinkedList before insertion
        System.out.println("Before insertion:");
        for (String color : colorsList) {
            System.out.println(color);
        }

        // Insert a new color at the front
        String newFrontColor = "Purple";
        colorsList.addFirst(newFrontColor);

        // Insert a new color at the end
        String newEndColor = "Yellow";
        colorsList.addLast(newEndColor);

        // Print the LinkedList after insertion
        System.out.println("\nAfter insertion at the front and end:");
        for (String color : colorsList) {
            System.out.println(color);
        }
    }
}

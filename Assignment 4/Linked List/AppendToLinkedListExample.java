import java.util.LinkedList;

public class AppendToLinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList to store elements
        LinkedList<String> namesList = new LinkedList<>();

        // Add some names to the LinkedList
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");
        namesList.add("David");

        // Print the LinkedList before appending
        System.out.println("Before appending:");
        for (String name : namesList) {
            System.out.println(name);
        }

        // Append a new name to the end of the LinkedList
        String newName = "Eva";
        namesList.addLast(newName);

        // Print the LinkedList after appending
        System.out.println("\nAfter appending:");
        for (String name : namesList) {
            System.out.println(name);
        }
    }
}

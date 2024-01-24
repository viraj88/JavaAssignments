import java.util.LinkedList;

public class OccurrenceLinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList to store elements
        LinkedList<String> fruitsList = new LinkedList<>();

        // Add some fruits to the LinkedList
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Orange");
        fruitsList.add("Apple");
        fruitsList.add("Grapes");
        fruitsList.add("Apple");

        // Specify the element to find
        String elementToFind = "Apple";

        // Find the first and last occurrences of the specified element
        int firstIndex = -1;
        int lastIndex = -1;

        for (int i = 0; i < fruitsList.size(); i++) {
            if (fruitsList.get(i).equals(elementToFind)) {
                if (firstIndex == -1) {
                    // First occurrence found
                    firstIndex = i;
                }
                // Update last occurrence on each iteration
                lastIndex = i;
            }
        }

        // Print the first and last occurrences
        System.out.println("First occurrence of \"" + elementToFind + "\": " + firstIndex);
        System.out.println("Last occurrence of \"" + elementToFind + "\": " + lastIndex);
    }
}

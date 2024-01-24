import java.util.LinkedList;
import java.util.ListIterator;

public class IterateFromPositionLinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList to store elements
        LinkedList<Integer> numbersList = new LinkedList<>();

        // Add some numbers to the LinkedList
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);
        numbersList.add(50);

        // Specify the starting position
        int startingPosition = 2;

        // Check if the starting position is valid
        if (startingPosition >= 0 && startingPosition < numbersList.size()) {
            // Create a list iterator starting at the specified position
            ListIterator<Integer> iterator = numbersList.listIterator(startingPosition);

            // Iterate through all elements starting at the specified position
            System.out.println("Elements in the LinkedList starting at position " + startingPosition + ":");

            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } else {
            System.out.println("Invalid starting position. Please provide a valid starting position.");
        }
    }
}

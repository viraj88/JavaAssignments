import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store elements
        ArrayList<String> cardsList = new ArrayList<>();

        // Add some playing cards to the ArrayList
        cardsList.add("Ace");
        cardsList.add("2");
        cardsList.add("3");
        cardsList.add("4");
        cardsList.add("5");
        cardsList.add("6");
        cardsList.add("7");
        cardsList.add("8");
        cardsList.add("9");
        cardsList.add("10");
        cardsList.add("Jack");
        cardsList.add("Queen");
        cardsList.add("King");

        // Print the ArrayList before shuffling
        System.out.println("Before shuffling:");
        for (String card : cardsList) {
            System.out.print(card + " ");
        }
        System.out.println();

        // Shuffle the elements in the ArrayList
        Collections.shuffle(cardsList);

        // Print the ArrayList after shuffling
        System.out.println("\nAfter shuffling:");
        for (String card : cardsList) {
            System.out.print(card + " ");
        }
    }
}

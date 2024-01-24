import java.util.ArrayList;

public class IterateArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store elements
        ArrayList<Integer> numbersList = new ArrayList<>();

        // Add some numbers to the ArrayList
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);
        numbersList.add(50);

        // Iterate through all elements in the ArrayList
        System.out.println("Elements in the ArrayList:");

        for (int i = 0; i < numbersList.size(); i++) {
            System.out.println(numbersList.get(i));
        }
    }
}

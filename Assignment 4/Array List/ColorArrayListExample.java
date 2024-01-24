import java.util.ArrayList;

public class ColorArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store colors
        ArrayList<String> colorsList = new ArrayList<>();

        // Add some colors to the ArrayList
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Blue");
        colorsList.add("Yellow");
        colorsList.add("Purple");

        // Print the collection
        System.out.println("Colors in the ArrayList:");

        for (String color : colorsList) {
            System.out.println(color);
        }
    }
}

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet to store colors
        TreeSet<String> colorsSet = new TreeSet<>();

        // Add some colors to the TreeSet
        colorsSet.add("Red");
        colorsSet.add("Green");
        colorsSet.add("Blue");
        colorsSet.add("Yellow");
        colorsSet.add("Purple");

        // Print the TreeSet
        System.out.println("Colors in the TreeSet:");

        for (String color : colorsSet) {
            System.out.println(color);
        }
    }
}

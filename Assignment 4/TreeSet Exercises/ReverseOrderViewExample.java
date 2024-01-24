import java.util.TreeSet;

public class ReverseOrderViewExample {
    public static void main(String[] args) {
        // Create the first TreeSet
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Orange");

        // Create the second TreeSet
        TreeSet<String> set2 = new TreeSet<>();
        set2.add("Grapes");
        set2.add("Mango");
        set2.add("Pineapple");

        // Print the original TreeSets
        System.out.println("Original TreeSet 1: " + set1);
        System.out.println("Original TreeSet 2: " + set2);

        // Create reverse order views of the TreeSets
        TreeSet<String> reverseView1 = new TreeSet<>(set1.descendingSet());
        TreeSet<String> reverseView2 = new TreeSet<>(set2.descendingSet());

        // Print the reverse order views
        System.out.println("\nReverse Order View of TreeSet 1: " + reverseView1);
        System.out.println("Reverse Order View of TreeSet 2: " + reverseView2);
    }
}

import java.util.TreeSet;

public class AddAllToTreeSetExample {
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

        // Print the TreeSets before adding
        System.out.println("TreeSet 1: " + set1);
        System.out.println("TreeSet 2: " + set2);

        // Add all elements from set2 to set1
        set1.addAll(set2);

        // Print the TreeSet after adding
        System.out.println("\nAfter adding all elements from TreeSet 2 to TreeSet 1:");
        System.out.println("TreeSet 1: " + set1);
        System.out.println("TreeSet 2: " + set2);
    }
}

import java.util.*;

public class TreeMapCopyExample {
    public static void main(String[] args) {
        // Create the first TreeMap
        TreeMap<String, Integer> originalTreeMap = new TreeMap<>();

        // Associate values with keys
        originalTreeMap.put("Java", 1);
        originalTreeMap.put("Python", 2);
        originalTreeMap.put("C++", 3);
        originalTreeMap.put("JavaScript", 4);

        // Display the original TreeMap
        System.out.println("Original TreeMap: " + originalTreeMap);

        // Create the second TreeMap and copy content from the original
        TreeMap<String, Integer> copiedTreeMap = new TreeMap<>(originalTreeMap);

        // Display the copied TreeMap
        System.out.println("Copied TreeMap: " + copiedTreeMap);
    }
}

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Associate values with keys
        treeMap.put("Java", 1);
        treeMap.put("Python", 2);
        treeMap.put("C++", 3);
        treeMap.put("JavaScript", 4);

        // Display the TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Add a new key-value pair
        String newKey = "Ruby";
        int newValue = 5;
        treeMap.put(newKey, newValue);

        // Display the updated TreeMap
        System.out.println("Updated TreeMap: " + treeMap);

        // Access the value associated with a specific key
        String keyToAccess = "Java";
        int valueAssociated = treeMap.get(keyToAccess);
        System.out.println("Value associated with key '" + keyToAccess + "': " + valueAssociated);
    }
}

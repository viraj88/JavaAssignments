import java.util.*;

public class TreeMapGetKeysExample {
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

        // Get all keys from the TreeMap
        Set<String> keys = treeMap.keySet();

        // Display the keys
        System.out.println("Keys in TreeMap: " + keys);
    }
}

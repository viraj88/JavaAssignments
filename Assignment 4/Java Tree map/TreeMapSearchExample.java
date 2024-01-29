import java.util.*;

public class TreeMapSearchExample {
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

        // Search for a key in the TreeMap
        String keyToSearch = "Python";
        if (treeMap.containsKey(keyToSearch)) {
            int valueAssociated = treeMap.get(keyToSearch);
            System.out.println("Key '" + keyToSearch + "' found. Value associated: " + valueAssociated);
        } else {
            System.out.println("Key '" + keyToSearch + "' not found in the TreeMap.");
        }
    }
}

import java.util.*;

public class TreeMapSearchValueExample {
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

        // Search for a value in the TreeMap
        int valueToSearch = 3;
        if (treeMap.containsValue(valueToSearch)) {
            Set<Map.Entry<String, Integer>> entrySet = treeMap.entrySet();
            for (Map.Entry<String, Integer> entry : entrySet) {
                if (entry.getValue() == valueToSearch) {
                    System.out.println("Value '" + valueToSearch + "' found. Key associated: " + entry.getKey());
                }
            }
        } else {
            System.out.println("Value '" + valueToSearch + "' not found in the TreeMap.");
        }
    }
}

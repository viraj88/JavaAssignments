import java.util.HashMap;
import java.util.Map;

public class FindDuplicateStrings {
    public static void main(String[] args) {
        String[] array = {"apple", "orange", "banana", "apple", "grape", "banana", "kiwi"};

        // Find and display duplicate values
        String[] duplicates = findDuplicateStrings(array);
        System.out.println("Duplicate values in the array:");
        for (String value : duplicates) {
            System.out.println(value);
        }
    }

    static String[] findDuplicateStrings(String[] arr) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String value : arr) {
            // Update the frequency of each string in the map
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }

        // Find strings with frequency greater than 1 (duplicates)
        return frequencyMap.keySet().stream()
                .filter(key -> frequencyMap.get(key) > 1)
                .toArray(String[]::new);
    }
}

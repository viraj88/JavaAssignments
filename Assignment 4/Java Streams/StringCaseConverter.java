import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCaseConverter {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "Banana", "Cherry", "Date", "grape");

        // Convert to uppercase using streams
        List<String> uppercaseList = stringList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Original List: " + stringList);
        System.out.println("Uppercase List: " + uppercaseList);

        // Convert to lowercase using streams
        List<String> lowercaseList = stringList.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println("Lowercase List: " + lowercaseList);
    }
}

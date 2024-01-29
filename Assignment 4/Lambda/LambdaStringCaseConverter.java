import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaStringCaseConverter {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "Banana", "Cherry", "Date", "grape");

        // Using lambda expression to convert to uppercase
        List<String> uppercaseList = stringList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Original List: " + stringList);
        System.out.println("Uppercase List: " + uppercaseList);

        // Using lambda expression to convert to lowercase
        List<String> lowercaseList = stringList.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println("Lowercase List: " + lowercaseList);
    }
}

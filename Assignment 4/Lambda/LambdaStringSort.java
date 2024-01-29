import java.util.Arrays;
import java.util.List;

public class LambdaStringSort {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> stringList = Arrays.asList("Orange", "Banana", "Apple", "Grapes", "Cherry");

        // Using lambda expression to sort the list in alphabetical order
        stringList.sort((str1, str2) -> str1.compareTo(str2));

        // Print the sorted list
        System.out.println("Sorted List: " + stringList);
    }
}

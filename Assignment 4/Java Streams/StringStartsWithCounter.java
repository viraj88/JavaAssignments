import java.util.Arrays;
import java.util.List;

public class StringStartsWithCounter {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "cherry", "date", "grape");

        char targetLetter = 'b';

        // Count the number of strings starting with the specific letter using streams
        long count = stringList.stream()
                .filter(s -> s.startsWith(String.valueOf(targetLetter)))
                .count();

        System.out.println("Number of strings starting with '" + targetLetter + "': " + count);
    }
}

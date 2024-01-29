import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaEvenOddFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using lambda expression to filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Original List: " + numbers);
        System.out.println("Even Numbers: " + evenNumbers);

        // Using lambda expression to filter odd numbers
        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("Odd Numbers: " + oddNumbers);
    }
}

import java.util.Arrays;
import java.util.List;

public class EvenOddSumCalculator {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Calculate sum of even numbers using streams
        int sumOfEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of Even Numbers: " + sumOfEven);

        // Calculate sum of odd numbers using streams
        int sumOfOdd = numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of Odd Numbers: " + sumOfOdd);
    }
}

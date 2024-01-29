import java.util.function.Function;

public class LambdaFactorialCalculator {
    public static void main(String[] args) {
        // Using lambda expression to calculate factorial
        Function<Integer, Long> factorial = n -> n == 0 ? 1 : n * factorial.apply(n - 1);

        // Example number
        int number = 5;

        // Calculate and print the factorial using the lambda expression
        long result = factorial.apply(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}

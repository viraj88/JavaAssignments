interface SumCalculator {
    int calculateSum(int a, int b);
}

public class LambdaSumExample {
    public static void main(String[] args) {
        // Using lambda expression to implement SumCalculator interface
        SumCalculator sumCalculator = (a, b) -> a + b;

        // Example numbers
        int number1 = 10;
        int number2 = 20;

        // Calculate and print the sum using the lambda expression
        int result = sumCalculator.calculateSum(number1, number2);
        System.out.println("Sum of " + number1 + " and " + number2 + " is: " + result);
    }
}

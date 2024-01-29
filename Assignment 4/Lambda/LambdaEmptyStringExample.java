interface StringChecker {
    boolean checkEmpty(String str);
}

public class LambdaEmptyStringExample {
    public static void main(String[] args) {
        // Using lambda expression to implement StringChecker interface
        StringChecker isEmptyChecker = str -> str.isEmpty();

        // Example strings
        String emptyString = "";
        String nonEmptyString = "Hello, World!";

        // Check if strings are empty using the lambda expression
        System.out.println("Is the string '" + emptyString + "' empty? " + isEmptyChecker.checkEmpty(emptyString));
        System.out.println("Is the string '" + nonEmptyString + "' empty? " + isEmptyChecker.checkEmpty(nonEmptyString));
    }
}

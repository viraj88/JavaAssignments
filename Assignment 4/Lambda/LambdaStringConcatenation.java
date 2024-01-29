interface StringConcatenator {
    String concatenateStrings(String str1, String str2);
}

public class LambdaStringConcatenation {
    public static void main(String[] args) {
        // Using lambda expression to implement StringConcatenator interface
        StringConcatenator concatenator = (str1, str2) -> str1 + str2;

        // Example strings
        String firstString = "Hello, ";
        String secondString = "World!";

        // Concatenate and print the strings using the lambda expression
        String result = concatenator.concatenateStrings(firstString, secondString);
        System.out.println("Concatenated String: " + result);
    }
}

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveNonAlphanumeric {
    public static void main(String[] args) {
        String inputString = "Hello, @World! 123";

        // Remove non-alphanumeric characters using regular expression
        String resultString = removeNonAlphanumeric(inputString);

        // Print the original and modified strings
        System.out.println("Original String: " + inputString);
        System.out.println("String after removing non-alphanumeric characters: " + resultString);
    }

    static String removeNonAlphanumeric(String input) {
        // Define the regular expression pattern for non-alphanumeric characters
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");

        // Use Matcher to find and replace non-alphanumeric characters
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll("");
    }
}

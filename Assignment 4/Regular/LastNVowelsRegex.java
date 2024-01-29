import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastNVowelsRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        String lastNVowels = getLastNVowels(inputString, n);

        System.out.println("Original String: " + inputString);
        System.out.println("Last " + n + " Vowels: " + lastNVowels);

        scanner.close();
    }

    static String getLastNVowels(String input, int n) {
        // Define a regular expression for vowels
        String vowelRegex = "[aeiouAEIOU]";

        // Create a Pattern object
        Pattern vowelPattern = Pattern.compile(vowelRegex);

        // Create a Matcher object
        Matcher matcher = vowelPattern.matcher(input);

        // Find all occurrences of vowels
        int vowelCount = 0;
        while (matcher.find()) {
            vowelCount++;
        }

        // Reset Matcher for finding the last n vowels
        matcher.reset();

        // Find the last n vowels
        int count = 0;
        while (matcher.find()) {
            count++;
            if (count > vowelCount - n) {
                break;
            }
        }

        // Use Matcher to get the substring containing the last n vowels
        return matcher.group();
    }
}

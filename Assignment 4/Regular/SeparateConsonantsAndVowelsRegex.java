import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeparateConsonantsAndVowelsRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String[] separatedStrings = separateConsonantsAndVowels(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("Consonants: " + separatedStrings[0]);
        System.out.println("Vowels: " + separatedStrings[1]);

        scanner.close();
    }

    static String[] separateConsonantsAndVowels(String input) {
        // Define regular expressions for consonants and vowels
        String consonantRegex = "[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]";
        String vowelRegex = "[aeiouAEIOU]";

        // Create Pattern objects
        Pattern consonantPattern = Pattern.compile(consonantRegex);
        Pattern vowelPattern = Pattern.compile(vowelRegex);

        // Create Matcher objects
        Matcher consonantMatcher = consonantPattern.matcher(input);
        Matcher vowelMatcher = vowelPattern.matcher(input);

        // Use Matcher to find consonants and vowels
        String consonants = consonantMatcher.replaceAll("");
        String vowels = vowelMatcher.replaceAll("");

        return new String[]{consonants, vowels};
    }
}

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a phone number (XXX-XXX-XXXX): ");
        String phoneNumber = scanner.nextLine();

        if (isValidPhoneNumber(phoneNumber)) {
            System.out.println("Valid phone number.");
        } else {
            System.out.println("Invalid phone number format.");
        }

        scanner.close();
    }

    static boolean isValidPhoneNumber(String phoneNumber) {
        // Define the regular expression pattern for a U.S. phone number
        // This example assumes a format like XXX-XXX-XXXX, where X is a digit
        String regex = "^\\d{3}-\\d{3}-\\d{4}$";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(phoneNumber);

        // Return true if the phone number matches the pattern, otherwise false
        return matcher.matches();
    }
}

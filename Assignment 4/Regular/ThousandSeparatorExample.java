import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ThousandSeparatorExample {
    public static void main(String[] args) {
        // Create a Scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Read a number from the user
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Set the thousand separator
        String formattedNumber = formatNumberWithThousandSeparator(number);

        // Print the formatted number
        System.out.println("Formatted Number: " + formattedNumber);

        // Close the scanner
        scanner.close();
    }

    static String formatNumberWithThousandSeparator(double number) {
        // Create a NumberFormat instance with the default locale
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.getDefault());

        // Format the number with thousand separators
        return numberFormat.format(number);
    }
}

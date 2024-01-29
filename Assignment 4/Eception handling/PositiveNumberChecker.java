import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PositiveNumberChecker {

    public static void main(String[] args) {
        try {
            readNumbersFromFile("numbers.txt");
            System.out.println("All numbers are non-positive.");
        } catch (PositiveNumberException | IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    static void readNumbersFromFile(String fileName) throws PositiveNumberException, IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line.trim());
                if (number > 0) {
                    throw new PositiveNumberException("Error: Positive number found in the file.");
                }
            }
        }
    }
}

class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmptyFileChecker {

    public static void main(String[] args) {
        try {
            checkIfFileNotEmpty("sample.txt");
            System.out.println("The file is not empty.");
        } catch (EmptyFileException | IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    static void checkIfFileNotEmpty(String fileName) throws EmptyFileException, IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            if (reader.readLine() == null) {
                throw new EmptyFileException("Error: The file is empty.");
            }
        }
    }
}

class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}

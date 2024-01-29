public class OddNumberChecker {

    public static void main(String[] args) {
        try {
            int numberToCheck = 5;
            checkIfEven(numberToCheck);
            System.out.println(numberToCheck + " is an even number.");
        } catch (OddNumberException e) {
            System.err.println(e.getMessage());
        }
    }

    static void checkIfEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("Error: " + number + " is an odd number.");
        }
    }
}

class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

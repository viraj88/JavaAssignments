import java.util.Scanner;

public class CheckArrayWithoutZeroAndMinusOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Read array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Check if the array contains 0 or -1
        boolean containsZeroOrMinusOne = containsZeroOrMinusOne(array);

        if (containsZeroOrMinusOne) {
            System.out.println("The array contains 0 or -1.");
        } else {
            System.out.println("The array does not contain 0 or -1.");
        }

        scanner.close();
    }

    static boolean containsZeroOrMinusOne(int[] arr) {
        for (int value : arr) {
            if (value == 0 || value == -1) {
                return true;
            }
        }
        return false;
    }
}

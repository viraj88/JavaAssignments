import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of size (n-1) to simulate a missing number
        int[] array = new int[size - 1];

        // Read array elements from the user
        System.out.println("Enter (n-1) elements of the array (one number is missing):");
        for (int i = 0; i < size - 1; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Find and display the missing number
        int missingNumber = findMissingNumber(array, size);
        System.out.println("Missing Number: " + missingNumber);

        scanner.close();
    }

    static int findMissingNumber(int[] arr, int size) {
        // Calculate the expected sum of numbers from 1 to size
        int expectedSum = size * (size + 1) / 2;

        // Calculate the actual sum of array elements
        int actualSum = 0;
        for (int value : arr) {
            actualSum += value;
        }

        // The missing number is the difference between expected and actual sum
        return expectedSum - actualSum;
    }
}

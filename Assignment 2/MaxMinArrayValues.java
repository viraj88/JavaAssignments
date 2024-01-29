import java.util.Scanner;

public class MaxMinArrayValues {
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

        // Find and display the maximum and minimum values
        int max = findMaxValue(array);
        int min = findMinValue(array);

        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);

        scanner.close();
    }

    static int findMaxValue(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty. No maximum value.");
            return Integer.MIN_VALUE;
        }

        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    static int findMinValue(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty. No minimum value.");
            return Integer.MAX_VALUE;
        }

        int min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}

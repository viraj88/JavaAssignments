import java.util.Scanner;

public class RemoveElementFromArray {
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

        // Read the element to be removed
        System.out.print("Enter the element to be removed: ");
        int elementToRemove = scanner.nextInt();

        // Remove the specified element
        array = removeElementFromArray(array, elementToRemove);

        // Display the array after removal
        System.out.println("Array after removing " + elementToRemove + ":");
        for (int value : array) {
            System.out.print(value + " ");
        }

        scanner.close();
    }

    static int[] removeElementFromArray(int[] arr, int element) {
        int count = 0;

        // Count occurrences of the specified element
        for (int value : arr) {
            if (value == element) {
                count++;
            }
        }

        // Create a new array with size reduced by the count of the specified element
        int[] newArray = new int[arr.length - count];

        int newIndex = 0;
        for (int value : arr) {
            if (value != element) {
                newArray[newIndex++] = value;
            }
        }

        return newArray;
    }
}

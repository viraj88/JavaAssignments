import java.util.Scanner;

public class InsertElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size + 1]; // Increased size for the new element

        // Read array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i) + ": ");
            array[i] = scanner.nextInt();
        }

        // Read the element to be inserted
        System.out.print("Enter the element to be inserted: ");
        int elementToInsert = scanner.nextInt();

        // Read the position at which the element should be inserted
        System.out.print("Enter the position to insert the element: ");
        int position = scanner.nextInt();

        // Insert the specified element at the specified position
        array = insertElementInArray(array, elementToInsert, position);

        // Display the array after insertion
        System.out.println("Array after inserting " + elementToInsert + " at position " + position + ":");
        for (int value : array) {
            System.out.print(value + " ");
        }

        scanner.close();
    }

    static int[] insertElementInArray(int[] arr, int element, int position) {
        if (position < 0 || position > arr.length + 1) {
            System.out.println("Invalid position. Element cannot be inserted.");
            return arr; // Return the original array if position is invalid
        }

        int[] newArray = new int[arr.length];

        // Copy elements before the insertion position
        for (int i = 0; i < position ; i++) {
            newArray[i] = arr[i];
        }

        // Insert the new element
        newArray[position] = element;

        // Copy elements after the insertion position
        for (int i = position ; i < arr.length - 1; i++) {
            newArray[i + 1] = arr[i];
        }

        return newArray;
    }
}

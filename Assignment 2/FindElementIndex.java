import java.util.Scanner;

public class FindElementIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Read array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i ) + ": ");
            array[i] = scanner.nextInt();
        }

        // Read the element to find its index
        System.out.print("Enter the element to find its index: ");
        int elementToFind = scanner.nextInt();

        // Find and display the index of the specified element
        int index = findElementIndex(array, elementToFind);

        if (index != -1) {
            System.out.println("Index of " + elementToFind + ": " + index);
        } else {
            System.out.println(elementToFind + " not found in the array.");
        }

        scanner.close();
    }

    static int findElementIndex(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        // If the element is not found, return -1
        return -1;
    }
}

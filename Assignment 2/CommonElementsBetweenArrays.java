import java.util.HashSet;
import java.util.Set;

public class CommonElementsBetweenArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        // Find and display common elements
        int[] commonElements = findCommonElements(array1, array2);
        System.out.println("Common elements between the two arrays:");
        for (int element : commonElements) {
            System.out.println(element);
        }
    }

    static int[] findCommonElements(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commonSet = new HashSet<>();

        // Add elements of the first array to a set
        for (int element : arr1) {
            set1.add(element);
        }

        // Check common elements with the second array
        for (int element : arr2) {
            if (set1.contains(element)) {
                commonSet.add(element);
            }
        }

        // Convert set to array
        return commonSet.stream().mapToInt(Integer::intValue).toArray();
    }
}

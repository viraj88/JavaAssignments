import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaRemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 9, 5);

        // Using lambda expression to remove duplicates
        List<Integer> uniqueNumbers = numbersWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Original List: " + numbersWithDuplicates);
        System.out.println("List without Duplicates: " + uniqueNumbers);
    }
}

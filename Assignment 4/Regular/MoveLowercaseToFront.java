public class MoveLowercaseToFront {
    public static void main(String[] args) {
        String inputWord = "HeLLoWorLD";

        String result = moveLowercaseToFront(inputWord);

        System.out.println("Original Word: " + inputWord);
        System.out.println("After Moving Lowercase to Front: " + result);
    }

    static String moveLowercaseToFront(String word) {
        // Separate lowercase and uppercase letters
        StringBuilder lowercaseLetters = new StringBuilder();
        StringBuilder uppercaseLetters = new StringBuilder();

        for (char ch : word.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lowercaseLetters.append(ch);
            } else {
                uppercaseLetters.append(ch);
            }
        }

        // Concatenate lowercase and uppercase letters while keeping the relative positions
        return lowercaseLetters.toString() + uppercaseLetters.toString();
    }
}

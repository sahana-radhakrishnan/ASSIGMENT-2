import java.util.*;

public class SentenceAnalyzer {
    public static void main(String[] args) {

        String sentence = "Java Programming is FUN and Powerful!";

        // 1. Count number of characters
        int charCount = sentence.length();
        System.out.println("1. Number of characters: " + charCount);

        // 2. Convert to lowercase
        String lowerCase = sentence.toLowerCase();
        System.out.println("2. Lowercase sentence: " + lowerCase);

        // 3. Replace spaces with underscores
        String replaced = sentence.replace(" ", "_");
        System.out.println("3. After replacing spaces: " + replaced);

        // 4. Check if sentence contains "Java"
        boolean hasJava = sentence.contains("Java");
        System.out.println("4. Contains 'Java'? " + hasJava);

        // 5. Extract "FUN" and convert to lowercase using substring
        int index = sentence.indexOf("FUN");
        if (index != -1) {
            String funLower = sentence.substring(index, index + 3).toLowerCase();
            System.out.println("5. 'FUN' in lowercase: " + funLower);
        } else {
            System.out.println("5. 'FUN' not found in the sentence.");
        }
    }
}

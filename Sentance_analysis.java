import java.util.*;

public class SentenceAnalysis {
    public static void main(String[] args) {

        String sentence = "Java Programming is FUN and Powerful!";

        // 1. Count characters
        int charCount = sentence.length();
        System.out.println("1. Number of characters: " + charCount);

        // 2. Convert to lowercase
        String lower = sentence.toLowerCase();
        System.out.println("2. Lowercase sentence: " + lower);

        // 3. Replace spaces with underscores
        String underscore = sentence.replace(" ", "_");
        System.out.println("3. Spaces replaced: " + underscore);

        // 4. Check if it contains "Java"
        boolean containsJava = sentence.contains("Java");
        System.out.println("4. Contains 'Java'? " + containsJava);

        // 5. Display the word "FUN" in lowercase using substring
        // Find the word FUN inside the sentence
        int start = sentence.indexOf("FUN");
        
        if (start != -1) {
            String funWord = sentence.substring(start, start + 3).toLowerCase();
            System.out.println("5. 'FUN' in lowercase: " + funWord);
        } else {
            System.out.println("5. Word 'FUN' not found.");
        }
    }
}

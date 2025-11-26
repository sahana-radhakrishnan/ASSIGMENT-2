import java.util.*;

public class GenericArrayPrinter {

    // Generic Method to print any array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
        System.out.println(); // for spacing
    }

    public static void main(String[] args) {

        // Example 1: String Array
        String[] languages = { "Java", "Python", "C++" };
        System.out.println("Printing String Array:");
        printArray(languages);

        // Example 2: Integer Array
        Integer[] numbers = { 1, 2, 3, 4 };
        System.out.println("Printing Integer Array:");
        printArray(numbers);
    }
}

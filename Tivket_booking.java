import java.util.Scanner;

// Custom Exception Class
class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class StudentGradingSystem {

    // Method to check grade
    public static void checkGrade(int marks) throws InvalidGradeException {
        if (marks > 100 || marks < 0) {
            throw new InvalidGradeException("Marks must be between 0 and 100.");
        } else {
            System.out.println("Marks accepted: " + marks);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        try {
            checkGrade(marks);  // Calling method that may throw the exception
        } catch (InvalidGradeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

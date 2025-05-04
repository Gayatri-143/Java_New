import java.util.Scanner;

// Custom exception class
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class OddNumberChecker {

    // Method to check if the number is odd
    public static void checkEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("Error: The number " + number + " is odd.");
        } else {
            System.out.println("The number " + number + " is even.");
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();

        try {
            checkEven(input);
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

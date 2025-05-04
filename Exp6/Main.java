import ExceptionHandlingDemo.Calculator;
import ExceptionHandlingDemo.DivisionException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter numerator: ");
        int a = scanner.nextInt();

        System.out.print("Enter denominator: ");
        int b = scanner.nextInt();

        try {
            int result = calc.divide(a, b);
            System.out.println("Result: " + result);
        } catch (DivisionException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

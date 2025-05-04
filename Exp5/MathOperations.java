import MathOperations.FloorOperation;
import MathOperations.CeilOperation;
import MathOperations.RoundOperation;

public class MathOperations {
    public static void main(String[] args) {
        double number1 = 5.67;
        double number2 = 4.32;

        System.out.println("Original Number 1: " + number1);
        System.out.println("Floor: " + FloorOperation.floorValue(number1));
        System.out.println("Ceil: " + CeilOperation.ceilValue(number1));
        System.out.println("Round: " + RoundOperation.roundValue(number1));

        System.out.println();

        System.out.println("Original Number 2: " + number2);
        System.out.println("Floor: " + FloorOperation.floorValue(number2));
        System.out.println("Ceil: " + CeilOperation.ceilValue(number2));
        System.out.println("Round: " + RoundOperation.roundValue(number2));
    }
}
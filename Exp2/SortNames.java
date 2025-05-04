import java.util.Arrays;
import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        
        
        System.out.println("Enter 5 names:");
        for (int i = 0; i < 5; i++) {
            names[i] = scanner.nextLine();
        }
        
       
        Arrays.sort(names);
        
        
        System.out.println("\nNames in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }
        
        scanner.close();
    }
}

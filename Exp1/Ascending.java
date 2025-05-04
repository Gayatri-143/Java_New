import java.util.Arrays;
import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        int i;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        System.out.println("Enter 10 elements:");
        for(i=0; i<10 ; i++){
             a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}

import java.util.Scanner;

public class Facto_1 {
    public static void main(String[] args) {
        System.out.println("Enter number for factorial: ");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int f=1,i;
        if(input<0){
            System.out.println("Factorial not exist for negative numbers!");

        }
        else if (input == 0 || input == 1) {
            System.out.println("Factorial : 0");
        }
        else{
            for(i=1;i<=input;i++){
            f=f*input;
        }
        }
        System.out.println("Factorial: "+ f);
    }
    
}

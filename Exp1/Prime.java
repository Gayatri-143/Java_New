//import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int n,i;
        boolean flag = false;

        if(args.length == 0){
        System.out.println("Please provide cmd line argument");
        return;
        }

        n = Integer.parseInt(args[0]);

        if(n == 0 || n == 1){
            flag = true;
        }

        for(i=2; i <= n / 2 ; i++){
            if(n%i == 0){
                flag = true;
                break;
            }
        }

        if(!flag){
            System.out.println("Number is prime!");
        }
        else{
            System.out.println("Number is not prime!!");
        }
    }
}

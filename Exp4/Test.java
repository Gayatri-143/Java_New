import java.util.Scanner;

class Student {
    int rollNo;

    public void getRollNo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student Roll No.: ");
        int rollNo = sc.nextInt();
    } 
    public void setRollNo(){
        System.out.println("Roll no.: " + rollNo);
    }
}
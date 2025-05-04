import java.util.Scanner;

class BankAccount {
    protected double balance;
    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    
    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 100.0;
    
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied! Balance cannot fall below " + MIN_BALANCE);
        }
    }
}

public class BankTest {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount(500);

        Scanner sc = new Scanner(System.in);
        double amount;
        int choice;

        System.out.print("Enter amount:");
        amount = sc.nextDouble();

        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.print("Enter choice:");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                myAccount.deposit(amount);
                System.out.println("Current balance: " + myAccount.getBalance());
                break;

            case 2:
                myAccount.withdraw(amount);
                System.out.println("Current balance: " + myAccount.getBalance());
                break;
        
            default:
                System.out.println("Enter valid choice!!");
                break;
        }
    }
}

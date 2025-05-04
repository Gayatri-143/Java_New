import java.util.Scanner;

// Custom Exception: LowBalanceException
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

// Custom Exception: NegativeNumberException
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

// BankAccount class with basic operations
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void balanceEnquiry() {
        System.out.println("Current balance: ₹" + balance);
    }

    public void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot deposit a negative amount.");
        }
        balance += amount;
        System.out.println("₹" + amount + " deposited successfully.");
    }

    public void withdraw(double amount) throws NegativeNumberException, LowBalanceException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot withdraw a negative amount.");
        }
        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance. Withdrawal denied.");
        }
        balance -= amount;
        System.out.println("₹" + amount + " withdrawn successfully.");
    }
}

// Main class
public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(1000); // Initial balance

        int choice;
        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Balance Enquiry");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        account.balanceEnquiry();
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ₹");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: ₹");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;
                    case 4:
                        System.out.println("Thank you for banking with us!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (NegativeNumberException | LowBalanceException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (choice != 4);

        scanner.close();
    }
}

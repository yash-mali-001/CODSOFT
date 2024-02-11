import java.util.*;

public class atm_interface {

    private double bal;  // To track balance

    public atm_interface(double initialBalance) {
        this.bal = initialBalance;
    }

    public void checkBalance() {
        System.out.println("Your current balance is: " + bal);
    }

    public void withdraw(double amount) {
        if (amount > bal) {
            System.out.println("Insufficient balance.");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount !");
        } else {
            bal -= amount;
            System.out.println("Withdrawal successful. New balance: " + bal);
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount !");
        } else {
            bal += amount;
            System.out.println("Deposit successful. New balance: " + bal);
        }
    }

    public void display() {
        Scanner s = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            while (!s.hasNextInt()) {
                System.out.print("Invalid input !!\nEnter your choice: ");
                s.next();
            }
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    while (!s.hasNextDouble()) {
                        System.out.print("Invalid withdrawal amount !\nEnter amount to withdraw: ");
                        s.next();
                    }
                    double amountToWithdraw = s.nextDouble();
                    withdraw(amountToWithdraw);
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    while (!s.hasNextDouble()) {
                        System.out.print("Invalid deposit amount !\nEnter amount to deposit: ");
                        s.next();
                    }
                    double amountToDeposit = s.nextDouble();
                    deposit(amountToDeposit);
                    break;
                case 0:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
        s.close();
    }

    public static void main(String[] args) {
        atm_interface atm = new atm_interface(1000.00);
        atm.display();
    }
}

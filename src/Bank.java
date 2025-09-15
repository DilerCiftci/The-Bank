import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 0;

        while (true) {
            System.out.println("Welcome to the bank terminal.");
            System.out.println("Choose an action by entering a number from 1-4:");
            System.out.println("1. Check balance.");
            System.out.println("2. Deposit.");
            System.out.println("3. Withdraw.");
            System.out.println("4. Exit.");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Your total balance is: " + balance);
            }

            else if (choice == 2) {
                System.out.println("Enter amount to deposit: ");
                int amount = scanner.nextInt();
                balance += amount;
                System.out.println("You deposited: " + amount);
            }

            else if (choice == 3) {
                System.out.println("Enter amount to withdraw: ");
                int amount = scanner.nextInt();
                balance -= amount;
                System.out.println("You withdrew: " + amount);
            }

            else if (choice == 4) {
                System.out.println("Thank you for choosing our bank services.");
                System.out.println("Goodbye!");
                break;
            }
        }
        scanner.close();
    }
}
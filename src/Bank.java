import java.util.Scanner;
import java.util.InputMismatchException;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Imports scanner class

        int balance = 0;
        // Creates "Balance" variable, balance starts at 0 by default

        while (true) {
            System.out.println("Welcome to the bank terminal.");
            System.out.println("Choose an action by entering a number from 1-4:");
            System.out.println("1. Check balance.");
            System.out.println("2. Deposit.");
            System.out.println("3. Withdraw.");
            System.out.println("4. Exit.");
            // Loops outputs until "4" is chosen through the "choice" variable.

            int choice;
            // Variable used to choose different actions in the menu.

            try {
                choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.println("Your total balance is: " + balance);
                } // Simply chooses "Check balance" and outputs your current balance.

                else if (choice == 2) {
                    System.out.println("Enter amount to deposit: ");
                    int amount = scanner.nextInt();
                    balance += amount;
                    System.out.println("You deposited: " + amount);
                } /*
                   * Chooses "Deposit" action, takes amount as input from user, adds it to your
                   * balance, Outputs amount deposited.
                   */

                else if (choice == 3) {
                    System.out.println("Enter amount to withdraw: ");
                    int amount = scanner.nextInt();
                    balance -= amount;
                    System.out.println("You withdrew: " + amount);
                } /*
                   * Chooses "Withdraw" action, takes amount as input from user, removes it from
                   * your balance, Outputs amount Withdrawn.
                   */

                else if (choice == 4) {
                    System.out.println("Thank you for choosing our bank services.");
                    System.out.println("Goodbye!");
                    break;
                } /*
                   * Chooses "Exit" action, outputs farewell message & closes the loop with
                   * "break;"
                   */
                else {
                    System.out.println("Invalid choice. Please select a number between 1 and 4. ");
                }
            }

            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numbers only.");
                scanner.nextLine();
            }
        }
        scanner.close(); // Closes scanner
    }
}
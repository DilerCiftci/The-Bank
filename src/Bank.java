import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        int balance = 0;

        while (true) {
            System.out.println("Welcome to the bank terminal.");
            System.out.println("Choose an action by entering a number from 1-4:");
            System.out.println("1. Check balance.");
            System.out.println("2. Deposit.");
            System.out.println("3. Withdraw.");
            System.out.println("4. Exit.");
        }
    }
}
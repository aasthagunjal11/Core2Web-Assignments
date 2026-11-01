/* Q10. Write a real-time example with at least 5 cases */
import java.util.Scanner;

class ATMMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ATM Menu");
        System.out.println("1. Check balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Change PIN");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your balance is ₹5,000");
                break;
            case 2:
                System.out.println("Deposit selected");
                break;
            case 3:
                System.out.println("Withdraw selected");
                break;
            case 4:
                System.out.println("Change PIN selected");
                break;
            case 5:
                System.out.println("Thank you for using the ATM");
                break;
            default:
                System.out.println("Invalid option");
        }

        scanner.close();
    }
}

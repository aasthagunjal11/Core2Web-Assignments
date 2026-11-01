/*6. Write a program to verify the age of the voter where the age should be positive, which
means no negative values are allowed. (T ake integer input from the user)
Input 1: 21
Output: V alid age for voting
Input 2: -31
Output: Invalid age*/

import java.util.Scanner;

class VerifyVoterAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        if (age > 0) {
            System.out.println("Valid age for voting");
        } else {
            System.out.println("Invalid age");
        }

        scanner.close();
    }
}

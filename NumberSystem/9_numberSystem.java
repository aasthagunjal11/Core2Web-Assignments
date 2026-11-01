/*
 Q9 Write a program to reverse the given number. 
Input: 942143 
Output: Reverse of 942143 is 341294.
*/

import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        System.out.println("Reverse of " + originalNumber + " is " + reverse + ".");

        scanner.close();
    }
}

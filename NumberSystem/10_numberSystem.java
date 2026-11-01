/*
 Q10 Write a program to check whether the given number is palindrome or
not.
Input: 12121 
Output: 12121 is a palindrome number.
Input: 12345 
Output: 12345 is not a palindrome number
*/

import java.util.Scanner;

class CheckPalindromeNumber {
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

        if (originalNumber == reverse) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }

        scanner.close();
    }
}

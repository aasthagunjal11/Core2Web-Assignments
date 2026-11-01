/*Q2 Write a program to check whether the given number is prime or not. 
Input: 12 
Output: 12 is not a prime number.
Input: 7 
Output: 7 is a prime number.*/

import java.util.Scanner;

class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPrime = number > 1;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}

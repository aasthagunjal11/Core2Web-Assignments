/*
 * Q1 Write a program to print the factors of a given number.
Input: 12
Output: Factors of 12 are 1,2,3,4,6,12
Input: 11
Output: Factors of 11 are 1,11*/

import java.util.Scanner;

class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Factors of " + number + " are ");

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }

	System.out.println();

        scanner.close();
    }
}

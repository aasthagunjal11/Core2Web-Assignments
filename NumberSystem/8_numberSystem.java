/*
 * Q8 Write a program to print the even digits and square of odd digits from a
given number.
Input: 16983265
Output: 25, 6, 2, 9, 8, 81, 6, 1*/

import java.util.Scanner;

class EvenDigitsAndOddDigitSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        number = Math.abs(number);

        while (number > 0) {
            int digit = number % 10;

            if (digit % 2 == 0) {
                System.out.print(digit);
            } else {
                System.out.print(digit * digit);
            }

            number /= 10;

            if (number > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        scanner.close();
    }
}

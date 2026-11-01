/*
 * Q7 Write a program to print the sum of even digits from a given number.
Input: 942111423
Output: The sum of even numbers from 942111423 is 12 
*/

import java.util.Scanner;

class SumOfEvenDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        number = Math.abs(number);
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;

            if (digit % 2 == 0) {
                sum += digit;
            }

            number /= 10;
        }

        System.out.println("The sum of even digits from "
                + originalNumber + " is " + sum);

        scanner.close();
    }
}

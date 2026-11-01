/*
 * Q6 Write a program to print the sum of digits from a given number.
Input: 942111423
Output: 27*/

import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        number = Math.abs(number);
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Sum of digits: " + sum);

        scanner.close();
    }
}

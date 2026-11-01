/*Q5 Write a program to print the digits from a given number.
Input: 7853 
Output : 3, 5, 8, 7 */

import java.util.Scanner;

class PrintDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        number = Math.abs(number);

        while (number > 0) {
            System.out.print(number % 10);
            number /= 10;

            if (number > 0) {
                System.out.print(", ");
            }
        }

	System.out.println();

        scanner.close();
    }
}

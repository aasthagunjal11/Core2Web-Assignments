/*
 * Q3 Write a program to check whether the given number is composite or
not.
Input: 6
Output: 6 is a composite number.
Input: 11
Output: 11 is not a composite number.
*/

import java.util.Scanner;

class CheckComposite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isComposite = false;

        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isComposite = true;
                    break;
                }
            }
        }

        if (isComposite) {
            System.out.println(number + " is a composite number.");
        } else {
            System.out.println(number + " is not a composite number.");
        }

        scanner.close();
    }
}

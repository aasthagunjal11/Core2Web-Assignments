/*1. Write a program to print the first ‘N’ natural numbers. Where N is user given
number.
Input:
N=10
Output: 1, 2, 3,4…10*/

import java.util.Scanner;

class NaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i);

            if (i < n) {
                System.out.print(", ");
            }
        }
	System.out.println();

        scanner.close();
    }
}

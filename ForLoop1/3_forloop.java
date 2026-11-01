/*3. Write a program to print the first ‘N’ 3-digit numbers. Where N is user given
number.
Input:
N=10
Output: 100,101,102,103,..,109*/

import java.util.Scanner;

class ThreeDigitNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(100 + i);

            if (i < n - 1) {
                System.out.print(", ");
            }
        }

	System.out.println();

        scanner.close();
    }
}

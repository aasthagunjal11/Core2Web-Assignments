/*Q1 Write a program to print the following pattern.
Input: Number of rows = 3
$  $  $
$  $  $
$  $  $
Input: Number of rows = 4
$  $  $  $
$  $  $  $
$  $  $  $
$  $  $  $*/

import java.util.Scanner;

class DollarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("$  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

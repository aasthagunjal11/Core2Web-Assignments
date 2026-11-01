/*
 * Q2 Write a program to print the following pattern
Number of rows = 3
2  4  6
8  10
12
Number of rows =
 4
2  4  6  8
10  12  14
16  18
20
*/

import java.util.Scanner;

class InvertedEvenNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int number = 2;

        for (int row = rows; row >= 1; row--) {
            for (int column = 1; column <= row; column++) {
                System.out.printf("%-4d", number);
                number += 2;
            }
            System.out.println();
        }

        scanner.close();
    }
}

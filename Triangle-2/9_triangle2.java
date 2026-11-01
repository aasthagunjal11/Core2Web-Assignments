/*
 * Q9 Write a program to print the following pattern
Number of rows = 3
1
1  2
2  3  4
Number of rows =
 4
1
1  2
2  3  4
4  5  6  7
*/

import java.util.Scanner;

class IncreasingNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int start = 1;

        for (int row = 1; row <= rows; row++) {
            for (int column = 0; column < row; column++) {
                System.out.printf("%-4d", start + column);
            }

            System.out.println();
            start += row - 1;
        }

        scanner.close();
    }
}

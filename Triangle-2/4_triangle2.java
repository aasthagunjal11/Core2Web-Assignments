/*
 Q4 Write a program to print the following pattern
Number of rows = 3
c
3  2
c  b  a
Number of rows =
 4
d
4  3
d  c  b
4  3  2  1
*/

import java.util.Scanner;

class MixedTrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= row; column++) {
                if (row % 2 == 1) {
                    char letter = (char) ('a' + rows - column);
                    System.out.printf("%-4c", letter);
                } else {
                    int number = rows - column + 1;
                    System.out.printf("%-4d", number);
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}

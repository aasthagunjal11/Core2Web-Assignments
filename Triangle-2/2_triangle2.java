/*
 Q2 Write a program to print the following pattern
Number of rows = 3
3 
2  4 
1  2  3
Number of rows =
 4
4 
3  6 
2  4  6 
1  2  3  4
*/

import java.util.Scanner;

class MultiplicationTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int row = 1; row <= rows; row++) {
            int start = rows - row + 1;

            for (int column = 1; column <= row; column++) {
                System.out.printf("%-4d", start * column);
            }

            System.out.println();
        }

        scanner.close();
    }
}

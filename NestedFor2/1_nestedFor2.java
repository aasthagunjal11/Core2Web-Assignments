/*Q1 Write a program to print the following pattern
Number of rows = 3 
1  2  3
3  4  5
5  6  7
Number of rows = 4 
1  2  3  4
4  5  6  7
7  8  9  10
10  11  12  13*/

import java.util.Scanner;

class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int start = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(start + j + "  ");
            }

            System.out.println();
            start += rows - 1;
        }

        scanner.close();
    }
}

/*Q2 Write a program to print the following pattern
Number of rows = 3
1  4  9 
16  25  36
49  64  81*/

import java.util.Scanner;

class SquareNumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int number = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print((number * number) + "  ");
                number++;
            }
            System.out.println();
        }

        scanner.close();
    }
}

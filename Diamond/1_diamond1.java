/*
1. WAP in notebook & Dry run first then type 
Take the number of rows from the user :
Rows = 3
            1 
         3  3  3
      5  5  5  5  5
         3  3  3
            1
Rows = 4
             1
          3  3  3
       5  5  5  5  5 
    7  7  7  7  7  7  7
       5  5  5  5  5
          3  3  3
             1

	     */

import java.util.Scanner;

class OddNumberDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int row = 1; row <= rows; row++) {
            printRow(row, rows);
        }

        for (int row = rows - 1; row >= 1; row--) {
            printRow(row, rows);
        }

        scanner.close();
    }

    static void printRow(int row, int rows) {
        for (int space = 0; space < rows - row; space++) {
            System.out.print("    ");
        }

        int value = 2 * row - 1;
        for (int column = 1; column <= value; column++) {
            System.out.print(value);
            if (column < value) {
                System.out.print("   ");
            }
        }

        System.out.println();
    }
}

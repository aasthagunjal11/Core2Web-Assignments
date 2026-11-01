/*
 * 5. WAP in notebook & Dry run first then type
Take the number of rows from the user :
Rows=3
        1
     2  2  2
  3  3  3  3  3
     2  2  2
        1

	*/

import java.util.Scanner;

class NumberDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            printRow(i, rows);
        }

        for (int i = rows - 1; i >= 1; i--) {
            printRow(i, rows);
        }

        scanner.close();
    }

    static void printRow(int row, int rows) {
        for (int space = 1; space <= rows - row; space++) {
            System.out.print("   ");
        }

        for (int j = 1; j <= 2 * row - 1; j++) {
            System.out.printf("%-3d", row);
        }

        System.out.println();
    }
}

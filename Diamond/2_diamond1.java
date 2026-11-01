/*2. WAP in notebook & Dry run first then type 
Take the number of rows from the user :
Rows = 3
                 1
             0  0  0
         1  1  1  1  1
             0  0  0
                 1 
Rows = 4
            1
        0  0  0
    1  1  1  1  1 
 0  0  0  0  0  0  0
     1  1  1  1  1
         0  0  0
             1

	     */

import java.util.Scanner;

class AlternatingZeroOneDiamond {
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

        int value = (row % 2 == 1) ? 1 : 0;
        int count = 2 * row - 1;

        for (int column = 1; column <= count; column++) {
            System.out.printf("%-4d", value);
        }

        System.out.println();
    }
}

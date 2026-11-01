/*Q6. Write a program to print the following patterns.

Number of rows = 3
3   6   9
2   5   8
1   4   7

Number of rows = 4
4   8   12   16
3   7   11   15
2   6   10   14
1   5    9   13 */

import java.util.Scanner;

class ColumnNumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = rows; i >= 1; i--) {
            for (int j = 0; j < rows; j++) {
                System.out.print((i + j * rows) + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

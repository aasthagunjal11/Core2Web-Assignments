/*
 *
 * 9.  W AP in notebook & Dry run first then type
T ake the number of rows from the user:
Rows = 3
3  6  9
   2  4
      1
Rows = 4
4  8  12  16
   3   6   9
       2   4
           1
 */

import java.util.Scanner;

class DecreasingMultiplesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int row = rows; row >= 1; row--) {
            int spaces = rows - row;

            for (int i = 0; i < spaces; i++) {
                System.out.print("    ");
            }

            for (int multiplier = 1; multiplier <= row; multiplier++) {
                System.out.printf("%-4d", row * multiplier);
            }

            System.out.println();
        }

        scanner.close();
    }
}

/*5.  W AP in notebook & Dry run first then type 
T ake the number of rows from the user:
Rows = 3 
A  b  C 
   1  2 
      C
Rows = 4 
1  2  3  4
   A  B  C 
      1  2 
         A

*/

import java.util.Scanner;

class ShiftedTrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int row = 1; row <= rows; row++) {
            for (int space = 1; space < row; space++) {
                System.out.print("    ");
            }

            int count = rows - row + 1;

            for (int column = 1; column <= count; column++) {
                if (row % 2 == 1) {
                    char letter = (char) ('A' + column - 1);
                    System.out.printf("%-4c", letter);
                } else {
                    System.out.printf("%-4d", column);
                }
            }

            System.out.println();
        }

        scanner.close();
    }
}

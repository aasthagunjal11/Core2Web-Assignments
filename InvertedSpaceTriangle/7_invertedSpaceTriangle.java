/*
 * 7.  W AP in notebook & Dry run first then type
T ake the number of rows from the user:
Rows = 3
A  b  C
   D  e
      F
Rows = 4
A  b  C  d
   E  f  G
      H  i
         J

*/

import java.util.Scanner;

class ShiftedAlphabetTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        char letter = 'A';

        for (int row = 1; row <= rows; row++) {
            for (int space = 1; space < row; space++) {
                System.out.print("    ");
            }

            int count = rows - row + 1;

            for (int column = 1; column <= count; column++) {
                if (letter % 2 == 0) {
                    System.out.printf("%-4c", letter);
                } else {
                    System.out.printf("%-4c", (char) (letter + 32));
                }

                letter++;
            }

            System.out.println();
        }

        scanner.close();
    }
}

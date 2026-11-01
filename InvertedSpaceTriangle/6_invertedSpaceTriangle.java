/*6.  W AP in notebook & Dry run first then type 
T ake the number of rows from the user:
Rows = 3 
9  8  7 
   6  5 
      4
Rows = 4 
16  15  14  13
    12  11  10 
         9  8 
            7

	*/

import java.util.Scanner;

class DecreasingNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int number = rows * rows;

        for (int row = 1; row <= rows; row++) {
            for (int space = 1; space < row; space++) {
                System.out.print("    ");
            }

            int count = rows - row + 1;

            for (int column = 1; column <= count; column++) {
                System.out.printf("%-4d", number);
                number--;
            }

            System.out.println();
        }

        scanner.close();
    }
}

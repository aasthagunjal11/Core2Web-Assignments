/*8.  W AP in notebook & Dry run first then type 
T ake the number of rows from the user:
Rows = 3 
64  7  36 
    5  16
        9
Rows = 4 
100  9  64  7
     6  25  4
         9  2 
            1

*/

import java.util.Scanner;

class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int totalValues = rows * (rows + 1) / 2;
        int number = totalValues + rows - 1;

        for (int row = 1; row <= rows; row++) {
            for (int space = 1; space < row; space++) {
                System.out.print("    ");
            }

            int count = rows - row + 1;

            for (int column = 1; column <= count; column++) {
                if (number % 2 == 0) {
                    System.out.printf("%-4d", number * number);
                } else {
                    System.out.printf("%-4d", number);
                }

                number--;
            }

            System.out.println();
        }

        scanner.close();
    }
}



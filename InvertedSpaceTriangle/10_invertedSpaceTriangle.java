/*10. W AP in notebook & Dry run first then type 
T ake the number of rows from the user:
Rows = 3 
24  21  18 
    15  12
         9
Rows = 4 
60  56  52  48
    44  40  36 
        32  28 
            24
	    */

import java.util.Scanner;

class DecreasingSequenceTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int number = rows * (rows + 1) * (rows + 2) / 2;

        for (int row = rows; row >= 1; row--) {
            for (int space = 0; space < rows - row; space++) {
                System.out.print("    ");
            }

            for (int column = 1; column <= row; column++) {
                System.out.printf("%-4d", number);
                number -= rows;
            }

            System.out.println();
        }

        scanner.close();
    }
}

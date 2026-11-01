/*2.  W AP in notebook & Dry run first then type 
T ake the number of rows from the user:
Rows = 3 
1  B  3 
B  3 
3
Rows = 4 
1  B  3  D
B  3  D 
3  D 
D
*/

import java.util.Scanner;

class NumberLetterPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int row = 1; row <= rows; row++) {
            for (int space = 1; space < row; space++) {
                System.out.print("   ");
            }

            for (int column = row; column <= rows; column++) {
                if (column % 2 == 1) {
                    System.out.printf("%-3d", column);
                } else {
                    char letter = (char) ('A' + column - 1);
                    System.out.printf("%-3c", letter);
                }
            }

            System.out.println();
        }

        scanner.close();
    }
}

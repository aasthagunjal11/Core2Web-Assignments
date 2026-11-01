/*3.  W AP in notebook & Dry run first then type 
T ake the number of rows from the user:
Rows = 3 
a  1  b 
1  c
d
Rows = 4 
a  1  b  2
1  c  2 
d  2 
2
*/

import java.util.Scanner;

class LetterNumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        char letter = 'a';
        int number = 1;

        for (int row = 1; row <= rows; row++) {
            for (int space = 1; space < row; space++) {
                System.out.print("    ");
            }

            for (int column = row; column <= rows; column++) {
                if ((row + column) % 2 == 0) {
                    System.out.printf("%-4c", letter);
                    letter++;
                } else {
                    System.out.printf("%-4d", number);
                    number++;
                }
            }

            System.out.println();
        }

        scanner.close();
    }
}

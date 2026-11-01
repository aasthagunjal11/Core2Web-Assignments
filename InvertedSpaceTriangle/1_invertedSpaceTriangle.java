/*1.  W AP in notebook & Dry run first then type 
T ake the number of rows from the user:
Rows = 3
a  b  c 
d  e 
f 
Rows = 4
a  b  c  d
e  f  g 
h  i 
j*/

import java.util.Scanner;

class AlphabetPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        char letter = 'a';

        for (int row = 1; row <= rows; row++) {
            for (int space = 1; space < row; space++) {
                System.out.print("   ");
            }

            for (int column = row; column <= rows; column++) {
                System.out.print(letter);

                if (column < rows) {
                    System.out.print("  ");
                }

                letter++;
            }

            System.out.println();
        }

        scanner.close();
    }
}

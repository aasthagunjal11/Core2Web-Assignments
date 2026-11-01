/*6. WAP in notebook & Dry run first then type
Take the number of rows from the user : 
Rows = 3
a
b c
d e f
Rows = 4
a
b c
d e f 
g h i j
*/

import java.util.Scanner;

class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        char letter = 'a';

        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(letter + "  ");
                letter++;
            }
            System.out.println();
        }

        scanner.close();
    }
}

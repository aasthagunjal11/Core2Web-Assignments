/*5. WAP in notebook & Dry run first then type 
Take the number of rows from the user :
Rows = 3
A
a b c
A B C D E
Rows = 4
A
a b c
A B C D E
a b c d e f g

*/

import java.util.Scanner;

class AlphabetPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            char letter = (i % 2 == 1) ? 'A' : 'a';

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(letter + " ");
                letter++;
            }
            System.out.println();
        }

        scanner.close();
    }
}

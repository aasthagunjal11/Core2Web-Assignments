/*10. WAP in notebook & Dry run first then type 
Take the number of rows from the user : 
Rows = 3
C C C C C
B B B
A
Rows = 4 
D D D D D D D
C C C C C
B B B
A
*/

import java.util.Scanner;

class InvertedAlphabetPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = rows; i >= 1; i--) {
            char letter = (char) ('A' + i - 1);
            int count = 2 * i - 1;

            for (int j = 1; j <= count; j++) {
                System.out.print(letter + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

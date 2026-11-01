/*3.  W AP in notebook & Dry run first then type 
T ake number of rows from user :
Rows = 3
C
B  C
A  B  C
Rows = 4
D 
C  D
B  C  D
A  B  C  D
*/

import java.util.Scanner;

class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        char lastLetter = (char) ('A' + rows - 1);

        for (int i = 1; i <= rows; i++) {
            char letter = (char) (lastLetter - i + 1);

            for (int j = 1; j <= i; j++) {
                System.out.print(letter + "  ");
                letter++;
            }
            System.out.println();
        }

        scanner.close();
    }
}

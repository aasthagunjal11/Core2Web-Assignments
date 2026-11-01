/*8. WAP in notebook & Dry run first then type 
Take the number of rows from the user : 
Rows = 3
f
e d
c b a
Rows = 4
j
i h
g f e 
d c b a
*/

import java.util.Scanner;

class ReverseAlphabetTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int totalLetters = rows * (rows + 1) / 2;
        char letter = (char) ('a' + totalLetters - 1);

        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(letter + "  ");
                letter--;
            }
            System.out.println();
        }

        scanner.close();
    }
}

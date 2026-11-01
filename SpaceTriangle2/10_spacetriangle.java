/*10. WAP in notebook & Dry run first then type 
Take the number of rows from the user : 
Rows = 3
1A
2b 2c
3D 3E 3F
Rows = 4
1A
2b 2c
3D 3E 3F
4G 4H 4I 4J
*/

import java.util.Scanner;

class NumberLetterTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        char letter = 'A';

        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= row; column++) {
                char outputLetter;

                if (row % 2 == 1) {
                    outputLetter = letter;
                } else {
                    outputLetter = (char) (letter + 32);
                }

                System.out.print(row + "" + outputLetter + "  ");
                letter++;
            }
            System.out.println();
        }

        scanner.close();
    }
}

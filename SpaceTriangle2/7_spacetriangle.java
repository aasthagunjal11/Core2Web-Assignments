/*7. WAP in notebook & Dry run first then type 
Take the number of rows from the user : 
Rows = 3
1
A A
4 5 6
Rows = 4
1
A A
4 5 6 
B B B B
*/

import java.util.Scanner;

class AlternatingNumberLetterTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int number = 1;
        char letter = 'A';

        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= row; column++) {
                if (row % 2 == 1) {
                    System.out.print(number + "  ");
                    number++;
                } else {
                    System.out.print(letter + "  ");
                }
            }

            if (row % 2 == 0) {
                letter++;
            }

            System.out.println();
        }

        scanner.close();
    }
}

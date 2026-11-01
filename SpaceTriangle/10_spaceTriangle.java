/*10. W AP in notebook & Dry run first then type 
T ake the number of rows from the user:
Rows = 4
D  C  B  A 
D  C  B 
D  C
D
Rows = 5
E  D  C  B  A 
E  D  C  B 
E  D  C
E  D
E*/

import java.util.Scanner;

class InvertedAlphabetTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = rows; i >= 1; i--) {
            for (int j = rows; j >= i; j--) {
                System.out.print((char) ('A' + rows - j) + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

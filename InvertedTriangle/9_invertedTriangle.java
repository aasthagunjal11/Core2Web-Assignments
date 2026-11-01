/*Q9 Write a program to print the following pattern
Number of rows = 3
c  b  a 
B  A 
a
Number of rows =
 4
D  C  B  A 
c  b  a 
B  A 
a
*/

import java.util.Scanner;

class InvertedAlphabetTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int row = rows; row >= 1; row--) {
            char letter = (char) ('A' + row - 1);

            for (int column = 1; column <= row; column++) {
                if ((rows - row) % 2 == 0) {
                    System.out.printf("%-3c", letter);
                } else {
                    System.out.printf("%-3c", (char) (letter + 32));
                }

                letter--;
            }

            System.out.println();
        }

        scanner.close();
    }
}

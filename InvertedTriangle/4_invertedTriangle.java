/*
 * Q4 Write a program to print the following pattern
Number of rows = 3
F  E  D
C  B
A
Number of rows =
 4
J  I  H  G
F  E  D
C  B
A
*/

import java.util.Scanner;

class InvertedAlphabetTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        // Start from the letter whose position is rows * (rows + 1) / 2
        char letter = (char) ('A' + (rows * (rows + 1) / 2) - 1);

        for (int row = rows; row >= 1; row--) {
            for (int column = 1; column <= row; column++) {
                System.out.printf("%-3c", letter);
                letter--;
            }
            System.out.println();
        }

        scanner.close();
    }
}

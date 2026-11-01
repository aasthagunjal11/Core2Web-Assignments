/*Q1 Write a program to print the following pattern
Input: Number of rows = 4
D  D  D  D 
C  C  C  C 
B  B  B  B 
A  A  A  A 
*/

import java.util.Scanner;

class ReverseAlphabetRows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = rows - 1; i >= 0; i--) {
            char letter = (char) ('A' + i);

            for (int j = 1; j <= rows; j++) {
                System.out.print(letter + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

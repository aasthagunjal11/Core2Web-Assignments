/*Q2 Write a program to print the following pattern
Input: Number of rows = 4
D  C  B  A 
A  B  C  D 
D  C  B  A 
A  B  C  D
*/

import java.util.Scanner;

class AlternatingAlphabetRows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            if (i % 2 == 1) {
                for (int j = rows - 1; j >= 0; j--) {
                    System.out.print((char) ('A' + j) + "  ");
                }
            } else {
                for (int j = 0; j < rows; j++) {
                    System.out.print((char) ('A' + j) + "  ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}

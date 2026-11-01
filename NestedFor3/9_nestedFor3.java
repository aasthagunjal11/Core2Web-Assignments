/*Q9 Write a program to print the following pattern
Input: Number of rows = 3
C  2  A 
A  2  C 
C  2  A
Input: Number of rows = 4
D  3  B  1 
A  2  C  4 
D  3  B  1 
A  2  C  4
*/

import java.util.Scanner;

class AlternatingNumberLetterPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i % 2 == 1) {
                    if (j % 2 == 1) {
                        System.out.print((char) ('A' + rows - j) + "  ");
                    } else {
                        System.out.print(j + "  ");
                    }
                } else {
                    if (j % 2 == 1) {
                        System.out.print((char) ('A' + j - 1) + "  ");
                    } else {
                        System.out.print(j + "  ");
                    }
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}

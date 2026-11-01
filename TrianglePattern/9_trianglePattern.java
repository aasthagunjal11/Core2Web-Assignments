/*Q9 Write a program to print the following pattern
Input: Number of rows = 4
D  C  B  A 
D  C  B 
D  C
D
Input: Number of rows = 5
E  D  C  B  A 
E  D  C  B 
E  D  C
E  D 
E
*/

import java.util.Scanner;

class InvertedAlphabetTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = rows; i >= 1; i--) {
            for (int j = rows - 1; j >= rows - i; j--) {
                System.out.print((char) ('A' + j) + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

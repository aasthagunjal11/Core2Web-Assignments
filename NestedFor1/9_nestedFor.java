/*Q9 Write a program to print the following pattern 
Input: Number of rows = 4
A  B  C  D 
A  B  C  D 
A  B  C  D 
A  B  C  D*/

import java.util.Scanner;

class AlphabetRowPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            char letter = 'A';

            for (int j = 1; j <= rows; j++) {
                System.out.print(letter + "  ");
                letter++;
            }

            System.out.println();
        }

        scanner.close();
    }
}

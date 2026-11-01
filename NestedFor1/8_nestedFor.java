/*Q8 Write a program to print the following pattern 
Input: Number of rows = 3
A  B  C 
D  E  F 
G  H  I*/

import java.util.Scanner;

class AlphabetPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        char letter = 'A';

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print(letter + "  ");
                letter++;
            }
            System.out.println();
        }

        scanner.close();
    }
}

/*
 10. WAP in notebook & Dry run first then type 
Take the number of rows from the user :
Rows=3 
        C
     B  C  B
  A  B  C  B  A
     B  C  B
        C
	*/

import java.util.Scanner;

class AlphabetDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int row = 1; row <= rows; row++) {
            printRow(row, rows);
        }

        for (int row = rows - 1; row >= 1; row--) {
            printRow(row, rows);
        }

        scanner.close();
    }

    static void printRow(int row, int rows) {
        char firstLetter = (char) ('A' + rows - row);
        char middleLetter = (char) ('A' + rows - 1);

        for (int space = 1; space <= rows - row; space++) {
            System.out.print("   ");
        }

        for (char letter = firstLetter; letter <= middleLetter; letter++) {
            System.out.print(letter + "  ");
        }
        for (char letter = (char) (middleLetter - 1); letter >= firstLetter; letter--) {
            System.out.print(letter + "  ");
        }

        System.out.println();
    }
}

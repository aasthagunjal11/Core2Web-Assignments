/*
 7. WAP in notebook & Dry run first then type 
Take the number of rows from the user :
row=4
             D 
          C  C  C 
       B  B  B  B  B 
    A  A  A  A  A  A  A 
       B  B  B  B  B 
          C  C  C 
             D
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
        char letter = (char) ('A' + rows - row);
        int count = 2 * row - 1;

        for (int space = 1; space <= rows - row; space++) {
            System.out.print("   ");
        }

        for (int i = 1; i <= count; i++) {
            System.out.print(letter);
            if (i < count) {
                System.out.print("  ");
            }
        }

        System.out.println();
    }
}

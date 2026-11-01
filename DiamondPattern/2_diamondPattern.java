/*
 
   2. WAP in notebook & Dry run first then type
Take the number of rows from the user :
Rows = 3
                3
             3  3  3
          3  3  3  3  3
             3  3  3
                3

		*/

import java.util.Scanner;

class NumberDiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("3 ");
            }

            System.out.println();
        }

        for (int i = rows - 1; i >= 1; i--) {
            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("3 ");
            }

            System.out.println();
        }

        scanner.close();
    }
}

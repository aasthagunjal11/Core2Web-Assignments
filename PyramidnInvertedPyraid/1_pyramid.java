/*1. WAP in notebook & Dry run first then type 
Take the number of rows from the user : 
Rows = 3
1
1 1 1
1 1 1 1 1
Rows = 4
1
1 1 1
1 1 1 1 1
1 1 1 1 1 1 1
*/

import java.util.Scanner;

class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

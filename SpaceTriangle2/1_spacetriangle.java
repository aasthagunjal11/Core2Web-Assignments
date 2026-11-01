/*1. WAP in notebook & Dry run first then type 
Take the number of rows from the user : 
Rows = 3
1
3 5
7 9 11
Rows = 4
1
3 5
7 9 11 
13 15 17 19
*/

import java.util.Scanner;

class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int number = 1;

        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(number + "  ");
                number += 2;
            }
            System.out.println();
        }

        scanner.close();
    }
}

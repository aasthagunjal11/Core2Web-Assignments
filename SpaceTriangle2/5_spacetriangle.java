/*5. WAP in notebook & Dry run first then type 
Take the number of rows from the user : 
Rows = 3
8
7 6
5 4 3 
Rows = 4
15
14 13
12 11 10
9 8 7 6
*/

import java.util.Scanner;

class DecreasingNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int number = rows * (rows + 1) / 2 + rows;

        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(number + "  ");
                number--;
            }
            System.out.println();
        }

        scanner.close();
    }
}

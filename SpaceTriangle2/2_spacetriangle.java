/*2. WAP in notebook & Dry run first then type 
Take the number of rows from the user :
Rows = 3
3
4 5
6 7 8
Rows = 4
4
5 6
7 8 9 
10 11 12 13
*/

import java.util.Scanner;

class NumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int number = rows;

        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(number + "  ");
                number++;
            }
            System.out.println();
        }

        scanner.close();
    }
}

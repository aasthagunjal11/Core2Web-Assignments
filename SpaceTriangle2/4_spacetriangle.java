/*4. WAP in notebook & Dry run first then type 
Take the number of rows from the user : 
Rows = 3
27
26 25
24 23 22
Note: Cube of 3 is 27. 
Rows = 4
64
63 62
61 60 59 
58 57 56 55 
Note: Cube of 4 is 64.
*/

import java.util.Scanner;

class DecreasingNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int number = rows * rows * rows;

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

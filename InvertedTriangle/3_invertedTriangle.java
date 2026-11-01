/*Q3 Write a program to print the following pattern
Number of rows = 3
12  10  8 
6  4 
2
Number of rows =
 4
20  18  16  14 
12  10  8 
6  4 
2
*/

import java.util.Scanner;

class InvertedEvenNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int number = rows * (rows + 1);

        for (int row = rows; row >= 1; row--) {
            for (int column = 1; column <= row; column++) {
                System.out.printf("%-4d", number);
                number -= 2;
            }
            System.out.println();
        }

        scanner.close();
    }
}

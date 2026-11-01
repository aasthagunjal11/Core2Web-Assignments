/*1 Write a program to print the following pattern
Number of rows = 3
1  2  3 
2  3 
3
Number of rows =
 4
1  2  3  4 
2  3  4 
3  4
4
*/

import java.util.Scanner;

class InvertedNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int row = 1; row <= rows; row++) {
            for (int number = row; number <= rows; number++) {
                System.out.printf("%-3d", number);
            }
            System.out.println();
        }

        scanner.close();
    }
}

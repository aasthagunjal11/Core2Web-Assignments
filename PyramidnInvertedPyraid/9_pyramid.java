/*Q9 Write a program to print the following pattern
Number of rows = 3
1  2  3  4  5
1  2  3
1
Number of rows =
 4
1  2  3  4  5  6  7 
1  2  3  4  5
1  2  3
1
*/

import java.util.Scanner;

class InvertedNumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = rows; i >= 1; i--) {
            int count = 2 * i - 1;

            for (int j = 1; j <= count; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

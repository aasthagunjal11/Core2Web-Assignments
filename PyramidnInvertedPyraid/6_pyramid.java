/*Q6 Write a program to print the following pattern
Number of rows = 3
1  1  1  1  1
2  2  2
3
Number of rows =
 4
1  1  1  1  1  1  1
2  2  2  2  2
3  3  3
4
*/

import java.util.Scanner;

class InvertedNumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            int count = 2 * (rows - i) + 1;

            for (int j = 1; j <= count; j++) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

/*Q4 Write a program to print the following pattern
Number of rows = 3
1
1  2  3 
1  2  3  4  5
Number of rows =
 4
1
1  2  3 
1  2  3  4  5 
1  2  3  4  5  6  7
*/

import java.util.Scanner;

class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

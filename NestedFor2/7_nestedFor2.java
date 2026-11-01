/*Q7 Write a program to print the following pattern
Number of rows = 4
1  3  5  7
2  4  6  8 
3  5  7  9 
4  6  8  10 */

import java.util.Scanner;

class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print((i + 2 * (j - 1)) + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

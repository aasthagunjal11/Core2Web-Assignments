/*Q3 Write a program to print the following pattern
Input: Number of rows = 4
1  5  9  13 
2  6  10  14 
3  7  11  15
4  8  12  16
*/

import java.util.Scanner;

class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print((i + j * rows) + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

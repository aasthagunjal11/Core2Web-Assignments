/*Q4 Write a program to print the following pattern
Input: Number of rows = 4
1  2  3  4 
2  4  6  8 
3  6  9  12 
4  8  12  16
*/

import java.util.Scanner;

class MultiplicationPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print((i * j) + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

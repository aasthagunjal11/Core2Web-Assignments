/*Q4 Write a program to print the following pattern 
Number of rows = 4
1  2  3  4
2  3  4  5
3  4  5  6
4  5  6  7
Number of rows = 3
1  2  3
2  3  4
3  4  5*/

import java.util.Scanner;

class IncreasingRowPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print((i + j - 1) + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

/*Q6 Write a program to print the following pattern 
Input: Number of rows = 3
1  2  3
1  2  3
1  2  3
Input: Number of rows = 4
1  2  3  4
1  2  3  4
1  2  3  4
1  2  3  4*/

import java.util.Scanner;

class ColumnNumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

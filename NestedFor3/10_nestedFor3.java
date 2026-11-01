/*Q10 Write a program to print the following pattern
Input: Number of rows = 3
12  11  10 
9    8   7 
6    5   4
Input: Number of rows = 4
20  19  18  17
16  15  14  13
12  11  10  9
 8  7   6   7
 */

import java.util.Scanner;

class ReverseNumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int number = rows * (rows + 1);

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print(number + "  ");
                number--;
            }
            System.out.println();
        }

        scanner.close();
    }
}

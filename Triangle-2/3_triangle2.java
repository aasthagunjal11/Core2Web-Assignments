/*Q3 Write a program to print the following pattern
Number of rows = 3
1 
2  4 
3  6  9
Number of rows =
 4
1 
2  4 
3  6  9 
4  8  12  16*/

import java.util.Scanner;

class MultiplicationTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.printf("%-4d", row * column);
            }
            System.out.println();
        }

        scanner.close();
    }
}

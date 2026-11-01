/*Q3 Write a program to print the following pattern
Input: Number of rows = 3
3 
3  2 
3  2  1
Input: Number of rows = 4
4 
4  3 
4  3  2 
4  3  2  1
*/

import java.util.Scanner;

class ReverseNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((rows - j) + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

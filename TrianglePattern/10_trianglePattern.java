/*Q10 Write a program to print the following pattern
Input: Number of rows = 3
3  6  9 
2  4 
1
Input: Number of rows = 4
4  8  12  16 
3  6  9 
2  4 
1
*/

import java.util.Scanner;

class InvertedMultiplesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i * j) + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

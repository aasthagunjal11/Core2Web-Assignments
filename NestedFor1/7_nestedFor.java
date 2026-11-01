/*Q7 Write a program to print the following pattern
Input: Number of rows = 3
3  2  1
3  2  1
3  2  1
Input: Number of rows = 4
4  3  2  1
4  3  2  1
4  3  2  1 
4  3  2  1 
*/

import java.util.Scanner;

class ReverseColumnPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= 1; j--) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

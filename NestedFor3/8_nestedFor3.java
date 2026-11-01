/*Q8 Write a program to print the following pattern
Input: Number of rows = 3
C  B  A 
1  2  3 
C  B  A
Input: Number of rows = 4
D  C  B  A 
1  2  3  4 
D  C  B  A 
1  2  3  4
*/

import java.util.Scanner;

class AlternatingPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            if (i % 2 == 1) {
                for (int j = rows - 1; j >= 0; j--) {
                    System.out.print((char) ('A' + j) + "  ");
                }
            } else {
                for (int j = 1; j <= rows; j++) {
                    System.out.print(j + "  ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}

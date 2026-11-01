/*Q3 Write a program to print the following pattern 
Input: Number of rows = 3
1  1  1
1  1  1 
1  1  1
Input: Number of rows = 4
1  1  1  1
1  1  1  1
1  1  1  1
1  1  1  1
*/

import java.util.Scanner;

class OnePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("1  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

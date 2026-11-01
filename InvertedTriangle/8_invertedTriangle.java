/*Q8 Write a program to print the following pattern
Number of rows = 3
3  2  1 
B  A 
1
Number of rows =
 4
4  3  2  1 
C  B  A 
2  1 
A
*/

import java.util.Scanner;

class InvertedAlternatingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int row = rows; row >= 1; row--) {
            if ((rows - row) % 2 == 0) {
                for (int number = row; number >= 1; number--) {
                    System.out.printf("%-3d", number);
                }
            } else if (row % 2 == 1) {
                char letter = (char) ('A' + row - 2);

                for (int count = 1; count <= row; count++) {
                    System.out.printf("%-3c", letter);
                    letter--;
                }
            } else {
                char letter = (char) ('A' + row - 2);

                for (int count = 1; count <= row; count++) {
                    System.out.printf("%-3c", letter);
                    letter--;
                }
            }

            System.out.println();
        }

        scanner.close();
    }
}

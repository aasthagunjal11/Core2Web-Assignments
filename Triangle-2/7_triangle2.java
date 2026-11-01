/*Q7 Write a program to print the following pattern
Number of rows = 3
1
B  A
3  2  1
Number of rows =
 4
1
B  A
3  2  1
D  C  B  A
*/

import java.util.Scanner;

class AlternatingReverseTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= row; column++) {
                if (row % 2 == 1) {
                    System.out.printf("%-3d", row - column + 1);
                } else {
                    char letter = (char) ('A' + row - column);
                    System.out.printf("%-3c", letter);
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}

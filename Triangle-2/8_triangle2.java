/*Q8 Write a program to print the following pattern
Number of rows = 3
1
2  A
3  B  1
Number of rows =
 4
1
2  A
3  B  1
4  C  2  A
*/

import java.util.Scanner;

class MixedTrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= row; column++) {
                if (column == 1) {
                    System.out.printf("%-3d", row);
                } else if (column % 2 == 0) {
                    char letter = (char) ('A' + column / 2 - 1);
                    System.out.printf("%-3c", letter);
                } else {
                    int number = row - column + 1;
                    System.out.printf("%-3d", number);
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}

/*Q5 Write a program to print the following pattern
Number of rows = 3
1
A  B
1  2  3
Number of rows = 4
1
A  B
1  2  3
A  B  C  D*/

import java.util.Scanner;

class AlternatingTrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= row; column++) {
                if (row % 2 == 1) {
                    System.out.printf("%-3d", column);
                } else {
                    char letter = (char) ('A' + column - 1);
                    System.out.printf("%-3c", letter);
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}

/*Q7 Write a program to print the following pattern
Number of rows = 3
3  b  1
2  a
1
Number of rows =
 4
4  c  2  a
3  b  1
2  a
1
*/

import java.util.Scanner;

class InvertedNumberLetterPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int row = rows; row >= 1; row--) {
            int number = row;
            char letter = (char) ('a' + row - 2);

            for (int column = 1; column <= row; column++) {
                if (column % 2 == 1) {
                    System.out.printf("%-3d", number);
                    number--;
                } else {
                    System.out.printf("%-3c", letter);
                    letter--;
                }
            }

            System.out.println();
        }

        scanner.close();
    }
}

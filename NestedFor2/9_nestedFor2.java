/*Q9 Write a program to print the following pattern
Number of rows = 3
1A  2B  3C 
3C  2B  1A
1A  2B  3C
Number of rows = 4
1A  2B  3C  4D
4D  3C  2B  1A
1A  2B  3C  4D
4D  3C  2B  1A 
*/

import java.util.Scanner;

class NumberLetterPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            if (i % 2 == 1) {
                // Odd rows: print from 1A up to the row count.
                for (int j = 1; j <= rows; j++) {
                    char letter = (char) ('A' + j - 1);
                    System.out.print(j + "" + letter + "  ");
                }
            } else {
                // Even rows: print in reverse order.
                for (int j = rows; j >= 1; j--) {
                    char letter = (char) ('A' + j - 1);
                    System.out.print(j + "" + letter + "  ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}

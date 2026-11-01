/*Q3 Write a program to print the following pattern
Number of rows = 4
d  c  b  a
d  c  b  a
d  c  b  a
d  c  b  a
Number of rows = 3
c  b  a
c  b  a
c  b  a*/

import java.util.Scanner;

class ReverseAlphabetPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = rows - 1; j >= 0; j--) {
                char letter = (char) ('a' + j);
                System.out.print(letter + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

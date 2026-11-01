/*Q10 Write a program to print the following pattern
Number of rows = 3
A  66  C 
66  C 
C
Number of rows = 4
65  B  67  D 
B  67  D 
67  D 
D
*/

import java.util.Scanner;

class LetterAsciiTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int row = 1; row <= rows; row++) {
            int start = row;

            for (int column = start; column <= rows; column++) {
                int position = column - start;

                if (position % 2 == 0) {
                    char letter = (char) ('A' + column - 1);
                    System.out.printf("%-4c", letter);
                } else {
                    int ascii = 'A' + column - 2;
                    System.out.printf("%-4d", ascii);
                }
            }

            System.out.println();
        }

        scanner.close();
    }
}

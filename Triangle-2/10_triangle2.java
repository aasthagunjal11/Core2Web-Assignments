/*Q10 Write a program to print the following pattern
Number of rows = 3
1
2  c
4  e  6
Number of rows =
 4
1
2  c
4  e  6
7  h  9  j
*/

import java.util.Scanner;

class NumberLetterTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int number = 1;
        int letterCode = 'c';

        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= row; column++) {
                if (column % 2 == 1) {
                    System.out.printf("%-4d", number);
                    number++;
                } else {
                    System.out.printf("%-4c", (char) letterCode);
                    letterCode += 2;
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}

/*Q8 Write a program to print the following pattern
Number of rows = 4
1  2  9  4
25  6  49  8 
81  10  121  12 
169  14  225  16 
*/

import java.util.Scanner;

class SquareOddPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int number = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (number % 2 == 0) {
                    System.out.print(number + "  ");
                } else {
                    System.out.print((number * number) + "  ");
                }
                number++;
            }
            System.out.println();
        }

        scanner.close();
    }
}

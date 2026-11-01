/*Q5 Write a program to print the following pattern
Input: Number of rows = 4
1  4  27  16 
125  36  343  64 
729  100  1331  144 
2197  196  3375  256
*/

import java.util.Scanner;

class PowerPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int number = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (number % 2 == 1) {
                    System.out.print((number * number * number) + "  ");
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

/*Q10 Write a program to print the following pattern
Number of rows = 3
#  #  #
$  $  $
@ @ @
Number of rows = 5
#  #  #  #  #
$  $  $  $  $
@ @ @ @ @
#  #  #  #  #
$  $  $  $   $
*/

import java.util.Scanner;

class SymbolPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            char symbol;

            if (i % 3 == 1) {
                symbol = '#';
            } else if (i % 3 == 2) {
                symbol = '$';
            } else {
                symbol = '@';
            }

            for (int j = 1; j <= rows; j++) {
                System.out.print(symbol + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

/*Q5 Write a program to print the following pattern
Number of rows = 3
A  B  C 
a  b 
A
Number of rows =
 4
A  B  C  D 
a  b  c 
A  B 
a
*/

import java.util.Scanner;

class InvertedAlphabetTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int row = rows; row >= 1; row--) {
            for (int column = 1; column <= row; column++) {
                char letter = (char) ('A' + column - 1);

                if ((rows - row) % 2 == 1) {
                    letter = (char) (letter + 32); // Convert to lowercase
                }

                System.out.printf("%-3c", letter);
            }
            System.out.println();
        }

        scanner.close();
    }
}

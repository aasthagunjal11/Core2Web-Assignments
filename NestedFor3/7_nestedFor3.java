/*Q7 Write a program to print the following pattern
Input: Number of rows = 3
C  C  C 
2  2  2 
A  A  A
*/

import java.util.Scanner;

class AlternatingCharacterPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = rows; i >= 1; i--) {
            if (i % 2 == 1) {
                char letter = (char) ('A' + i - 1);

                for (int j = 1; j <= rows; j++) {
                    System.out.print(letter + "  ");
                }
            } else {
                for (int j = 1; j <= rows; j++) {
                    System.out.print(i + "  ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}

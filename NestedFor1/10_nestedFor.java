/*Q10 Write a program to print the following pattern 
Input: Number of rows = 3
1A  2B  3C 
1A  2B  3C
1A  2B  3C
Input: Number of rows = 4
1A  2B  3C  4D 
1A  2B  3C  4D
1A  2B  3C  4D
1A  2B  3C  4D */

import java.util.Scanner;

class NumberAlphabetPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                char letter = (char) ('A' + j - 1);
                System.out.print(j + "" + letter + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

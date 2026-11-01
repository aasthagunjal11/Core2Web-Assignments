/*Q2 Write a program to print the following pattern.
Input: Enter string: c2w
Input: Number of rows = 3
c2w  c2w  c2w
c2w  c2w  c2w
c2w  c2w  c2w*/

import java.util.Scanner;

class StringPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print(text + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

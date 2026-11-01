/*Q5 Write a program to print the following pattern
Number of rows = 3
C1  C2  C3
C4  C5  C6
C7  C8  C9
Number of rows = 4
D1  D2  D3  D4 
D5  D6  D7  D8 
D9  D10  D11  D12 
D13  D14  D15  D16*/

import java.util.Scanner;

class LetterNumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        char letter = (char) ('A' + rows - 1);
        int number = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print(letter + "" + number + "  ");
                number++;
            }
            System.out.println();
        }

        scanner.close();
    }
}

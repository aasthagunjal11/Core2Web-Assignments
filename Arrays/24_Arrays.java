/* 24.WAP to take numbers from a user in a 2D array and print the sum of odd rows in the
array.
Example: 
Enter row = 3 
Enter column = 3
13  43  70 
125  80  26 
57  12  16
Output :
Sum of row 1 = 126
Sum of row 3 = 85 */

import java.util.Scanner;

class SumOfOddRows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        int[][] numbers = new int[rows][columns];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i += 2) {
            int sum = 0;

            for (int j = 0; j < columns; j++) {
                sum += numbers[i][j];
            }

            System.out.println("Sum of row " + (i + 1) + " = " + sum);
        }

        scanner.close();
    }
}

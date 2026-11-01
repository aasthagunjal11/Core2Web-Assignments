/* 29.WAP to take numbers from a user in a 2D array and print the product of sum of the
primary and secondary diagonal of an array.
Example: 
Enter row = 3 
Enter column = 3
13  43  70 
125  20  26 
17  12  16
Output :
Product of Sum of Primary and Secondary Diagonal : 5243 */

import java.util.Scanner;

class ProductOfDiagonalSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        if (rows != columns) {
            System.out.println("Diagonals require a square array.");
            scanner.close();
            return;
        }

        int[][] numbers = new int[rows][columns];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }

        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < rows; i++) {
            primarySum += numbers[i][i];
            secondarySum += numbers[i][columns - 1 - i];
        }

        int product = primarySum * secondarySum;

        System.out.println("Product of Sum of Primary and Secondary Diagonal: " + product);

        scanner.close();
    }
}

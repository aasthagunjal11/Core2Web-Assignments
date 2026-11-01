/*27.WAP to take numbers from a user in a 2D array and print the product of the primary
diagonal of an array.
Example: 
Enter row = 3 
Enter column = 3
13  43  70 
125  80  26 
57  12  16
Output :
Product of Primary Diagonal : 16640*/

import java.util.Scanner;

class PrimaryDiagonalProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        if (rows != columns) {
            System.out.println("A primary diagonal requires a square array.");
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

        long product = 1;

        for (int i = 0; i < rows; i++) {
            product *= numbers[i][i];
        }

        System.out.println("Product of Primary Diagonal: " + product);

        scanner.close();
    }
}

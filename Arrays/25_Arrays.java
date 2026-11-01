/*25.WAP to take numbers from a user in a 2D array and print the sum of each column in an
array.
Example: 
Enter row = 3 
Enter column = 3
3  43  70 
125  80  26 
57  12  16
Output :
Sum of column 1 = 195
Sum of column 2 = 135
Sum of column 3 = 112*/

import java.util.Scanner;

class SumOfEachColumn {
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

        for (int j = 0; j < columns; j++) {
            int sum = 0;

            for (int i = 0; i < rows; i++) {
                sum += numbers[i][j];
            }

            System.out.println("Sum of column " + (j + 1) + " = " + sum);
        }

        scanner.close();
    }
}

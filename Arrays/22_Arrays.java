/* 22.WAP to take numbers from a user in a 2D array and print the sum of the array.
Example: 
Enter row = 3 
Enter column = 3
13  43  70 
125  80  26 
57  12  16
Output : Sum = 442*/

import java.util.Scanner;

class SumOfTwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        int[][] numbers = new int[rows][columns];
        int sum = 0;

        System.out.println("Enter the array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = scanner.nextInt();
                sum += numbers[i][j];
            }
        }

        System.out.println("Sum = " + sum);

        scanner.close();
    }
}

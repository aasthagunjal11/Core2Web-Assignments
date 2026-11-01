/* 21.WAP to take numbers from a user in a 2D array and print the array.
Example: 
Enter row = 3 
Enter column = 3
12  23  10 
45  2  25 
87  112  96
Output :
12  23  10 
45  2  25
87  112  96
*/

import java.util.Scanner;

class PrintTwoDArray {
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

        System.out.println("Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

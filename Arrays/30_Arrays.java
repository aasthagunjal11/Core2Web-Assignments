/*
 30.WAP to take numbers from a user in a 2D array and print the corner elements in an
array .
Example: 
Enter row = 3
Enter column = 3
13  43  70 
125  20  26 
17  12  16
Output : 13 70 17 16 
*/

import java.util.Scanner;

class PrintCornerElements {
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

        System.out.println("Corner elements:");

        System.out.print(numbers[0][0] + " " + numbers[0][columns - 1] + " ");

        if (rows > 1) {
            System.out.print(numbers[rows - 1][0] + " " + numbers[rows - 1][columns - 1]);
        }

        scanner.close();
    }
}

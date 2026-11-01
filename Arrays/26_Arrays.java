/*26.WAP to take numbers from a user in a 2D array and print the elements which are
divisible by 3 in an array.
Example: 
Enter row = 3 
Enter column = 3
33  43  72 
125  24  26 
17  12  16
Output : 33, 72, 24, 12*/

import java.util.Scanner;

class DivisibleByThreeIn2DArray {
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

        System.out.print("Elements divisible by 3: ");
        boolean first = true;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (numbers[i][j] % 3 == 0) {
                    if (!first) {
                        System.out.print(", ");
                    }
                    System.out.print(numbers[i][j]);
                    first = false;
                }
            }
        }

        System.out.println();
        scanner.close();
    }
}

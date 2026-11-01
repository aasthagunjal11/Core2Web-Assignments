/*2.  W AP in notebook & Dry run first then type 
T ake number of rows from user:
Rows = 3 
3 
3  2 
3  2  1
Rows = 4
4 
4  3 
4  3  2 
4  3  2  1
*/

import java.util.Scanner;

class DescendingNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= rows - i + 1; j--) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

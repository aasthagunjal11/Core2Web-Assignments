/*4.  W AP in notebook & Dry run first then type 
T ake number of rows from user : 
Row = 3 
3 
3  6 
3  6  9
Rows = 4
4 
4  8 
4  8  12 
4  8  12  16
*/

import java.util.Scanner;

class MultipleNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((rows * j) + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

/*5.  W AP in notebook & Dry run first then type
T ake number of rows from user :
Row = 3 
1 
2  4 
3  6  9
Rows = 4
1 
2  4 
3  6  9 
4  8  12  16
T ake the number of rows from the user
 
Row=4 
*  *  *  * 
*  *  * 
*  * 
*

*/

import java.util.Scanner;

class MultiplicationTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i * j) + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

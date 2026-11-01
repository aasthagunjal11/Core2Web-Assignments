/*1.  W AP in notebook & Dry run first then type 
T ake number of rows from user :
Rows = 3
1
1  2
1  2  3
Rows = 4
1
1  2
1  2  3 
1  2  3  4
*/

import java.util.Scanner;

class NumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

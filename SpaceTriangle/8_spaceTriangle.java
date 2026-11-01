/*8.  W AP in notebook & Dry run first then type 
T ake number of rows from user :
Rows = 3 
1  2  3 
2  3
3
Rows = 4
1  2  3  4 
2  3  4 
3  4 
4
*/

import java.util.Scanner;

class InvertedIncreasingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= rows; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

/*8. WAP in notebook & Dry run first then type 
Take the number of rows from the user : 
Rows = 3
3 3 3 3 3
2 2 2
1
Rows = 4 
4 4 4 4 4 4 4
3 3 3 3 3
2 2 2
1
*/

import java.util.Scanner;

class InvertedNumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = rows; i >= 1; i--) {
            int count = 2 * i - 1;

            for (int j = 1; j <= count; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

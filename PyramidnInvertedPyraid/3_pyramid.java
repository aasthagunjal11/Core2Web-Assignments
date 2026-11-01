/*3. WAP in notebook & Dry run first then type 
Take the number of rows from the user :
Rows = 3
1
3 5 7
9 1 1 13 15 17
Rows = 4
1
3 5 7
9 1 1 13 15 17
19 21 23 25 27 29 31
*/

import java.util.Scanner;

class OddNumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int number = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(number + "  ");
                number += 2;
            }
            System.out.println();
        }

        scanner.close();
    }
}

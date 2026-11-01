/*3. WAP in notebook & Dry run first then type 
Take the number of rows from the user :
Rows = 3
1
2 9
4 25 6
Rows = 4
1
2 9
4 25 6 
49 8 81 10
*/

import java.util.Scanner;

class SquareEvenNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int position = 1;

        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= row; column++) {
                if (position % 2 == 1) {
                    int oddNumber = position;
                    System.out.print(oddNumber * oddNumber + "  ");
                } else {
                    System.out.print(position + "  ");
                }
                position++;
            }
            System.out.println();
        }

        scanner.close();
    }
}

/*7. WAP in notebook & Dry run first then type 
Take the number of rows from the user : 
Rows = 3
2 4 6 8 10
12 14 16
18 
Rows = 4
2 4 6 8 10 12 14
16 18 20 22 24
26 28 30
32

*/

import java.util.Scanner;

class EvenNumberInvertedPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int number = 2;

        for (int i = 1; i <= rows; i++) {
            int count = 2 * (rows - i) + 1;

            for (int j = 1; j <= count; j++) {
                System.out.print(number + "  ");
                number += 2;
            }
            System.out.println();
        }

        scanner.close();
    }
}

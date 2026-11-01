/*9.  W AP in notebook & Dry run first then type 
T ake number of rows from user :
rows = 3
A  66  C
66  C
C
rows = 4
65 B 67 D
B 67 D
67 D
D
*/

import java.util.Scanner;

class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= rows; j++) {
                System.out.print((char) ('A' + j - 1) + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

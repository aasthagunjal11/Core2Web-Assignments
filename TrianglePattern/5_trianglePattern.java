/*Q5 Write a program to print the following pattern
Input: Number of rows = 3
3 
3  6 
3  6  9
Input: Number of rows = 4
4 
4  8 
4  8  12 
4  8  12  16
Inverted T riangle
*  *  *  * 
*  *  * 
*  * 
*

*/

import java.util.Scanner;

class MultipleTriangle {
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

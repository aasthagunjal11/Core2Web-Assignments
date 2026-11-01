/*8. Write a program to print a table of ‘N’ in reverse order. Where N is user given
number.
Input: 
N=14
Output: 140, 126, 112, ..14*/

import java.util.Scanner;

class ReverseMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        for (int i = 10; i >= 1; i--) {
            System.out.print(n * i);

            if (i > 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        scanner.close();
    }
}

/*2. Write a program to print the first ‘N’ whole numbers. Where N is user given
number.
Input:
N=100
Output: 0,1,2,34,5…100*/

import java.util.Scanner;

class WholeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.print(i);

            if (i < n) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}

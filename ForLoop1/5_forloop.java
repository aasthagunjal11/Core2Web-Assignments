/*5. Write a program to print the odd numbers from 1 - N. Where N is user given number
Input: 
N=70
Output: 1,3,5,7,...69*/

import java.util.Scanner;

class OddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i += 2) {
            System.out.print(i);

            if (i + 2 <= n) {
                System.out.print(", ");
            }
        }
        System.out.println();
        scanner.close();
    }
}

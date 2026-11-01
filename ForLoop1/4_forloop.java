/*4. Write a program to print the even numbers from 1 to N. Where N is user given
number.
Input:
N=100
Output: 2,4,6,8,10,...100*/

import java.util.Scanner;

class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i += 2) {
            System.out.print(i);

            if (i + 2 <= n) {
                System.out.print(", ");
            }
        }
        System.out.println();
        scanner.close();
    }
}

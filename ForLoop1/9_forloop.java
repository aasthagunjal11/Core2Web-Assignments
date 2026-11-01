/*9. Write a program to print the sum of the first ‘N’ natural numbers. Where N is user
given number.
Input: 
N=10
Output:55*/

import java.util.Scanner;

class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum: " + sum);

        scanner.close();
    }
}

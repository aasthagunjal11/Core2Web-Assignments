/*10. Write a program to print the count of odd numbers between 1 And ‘N’. Where N
is user given number.
Input: 
N=10
Output:
Count of odd numbers: 5*/

import java.util.Scanner;

class CountOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }

        System.out.println("Count of odd numbers: " + count);

        scanner.close();
    }
}

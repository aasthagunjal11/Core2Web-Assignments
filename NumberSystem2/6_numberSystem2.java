/*6.  W AP that generates the first n numbers in the Fibonacci series. And store
it in an array of similar size as that of n.
Input:
Enter a number: 10
Output :
Fibonacci Series : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
*/

import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int[] fibonacci = new int[n];

        if (n > 0) {
            fibonacci[0] = 0;
        }

        if (n > 1) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i]);

            if (i < n - 1) {
                System.out.print(", ");
            }
        }
         System.out.println();
        scanner.close();
    }
}

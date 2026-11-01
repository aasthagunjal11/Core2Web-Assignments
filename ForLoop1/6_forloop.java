/*6. Write a program to print the numbers in reverse order from ‘N’- 10.Where N is
user given number.
Input: 
N=80 
Output: 80,79,78,77,..10*/

import java.util.Scanner;

class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N (10 or greater): ");
        int n = scanner.nextInt();

        for (int i = n; i >= 10; i--) {
            System.out.print(i);

            if (i > 10) {
                System.out.print(", ");
            }
        }
        System.out.println();
        scanner.close();
    }
}

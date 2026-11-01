/*Q4 Write a program to print the factorial of the number. 
Input: 6 
Output: A factorial of 6 is 720.
*/

import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is " + factorial + ".");

        scanner.close();
    }
}

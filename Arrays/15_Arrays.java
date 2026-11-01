/*15.Write a program to print the sum of odd indexed elements, in an array. Where you
have to take size input and elements input from the user .
Example: 
Input: 
Enter the size 
5 
Enter elements: 
4 
8 
2 
6
7 
Output: 
Sum of odd indexed elements : 14*/

import java.util.Scanner;

class SumOddIndexedElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 1; i < size; i += 2) {
            sum += numbers[i];
        }

        System.out.println("Sum of odd indexed elements: " + sum);

        scanner.close();
    }
}

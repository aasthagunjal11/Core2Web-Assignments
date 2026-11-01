/*16.Write a program to print the products of odd indexed elements in an array. Where you
have to take size input and elements input from the user.
Note: 
Example: 
Input: 
Enter the size 
6
Enter elements: 
1 
2 
3 
4 
5 
6 
Output: 
product of odd indexed elements : 48*/

import java.util.Scanner;

class ProductOddIndexedElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int product = 1;
        for (int i = 1; i < size; i += 2) {
            product *= numbers[i];
        }

        System.out.println("Product of odd indexed elements: " + product);

        scanner.close();
    }
}

/* 19. WAP to print the minimum element in the array, where you have to take the size and
elements from the user.
Example: 
Input: 
Enter the size 
5 
Enter elements: 
5 
6 
9 
-9 
17 
Output: 
Minimum number in the array is : -9*/

import java.util.Scanner;

class FindMinimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int minimum = numbers[0];

        for (int i = 1; i < size; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }

        System.out.println("Minimum number in the array is: " + minimum);

        scanner.close();
    }
}

/* 18.WAP to print the elements in an array which are greater than 5 but less than 9, where
you have to take the size and elements from the user.
Example: 
Input: 
Enter the size 
5 
Enter elements: 
4 
8 
6 
9 
41 
Output: 
8 is greater than 5 but less than 9 
6 is greater than 5 but less than 9 */

import java.util.Scanner;

class ElementsBetweenFiveAndNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (numbers[i] > 5 && numbers[i] < 9) {
                System.out.println(numbers[i] + " is greater than 5 but less than 9");
            }
        }

        scanner.close();
    }
}

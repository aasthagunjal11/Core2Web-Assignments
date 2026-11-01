/* 20. WAP to print the Maximum element in the array. 
Example: 
Input: 
Enter the size 
5 
Enter elements: 
7 
81
65 
12 
23 
Output: 
Maximum number in the array is found at pos 1 is 81
*/

import java.util.Scanner;

class FindMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maximum = numbers[0];
        int position = 0;

        for (int i = 1; i < size; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
                position = i;
            }
        }

        System.out.println("Maximum number in the array is found at pos "
                + position + " is " + maximum);

        scanner.close();
    }
}

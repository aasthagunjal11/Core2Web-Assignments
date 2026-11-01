/* 4. Write a program to print the sum of odd elements in an array.Take input from the user.
Example: 
Enter size: 10
Array: 
1  2  3  4  2  5  6  2  8  10
Output :
Sum of odd elements : 9 */

import java.util.Scanner;

class SumOfOddElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        int sum = 0;

        System.out.println("Enter " + size + " array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();

            if (numbers[i] % 2 != 0) {
                sum += numbers[i];
            }
        }

        System.out.println("Sum of odd elements: " + sum);

        scanner.close();
    }
}

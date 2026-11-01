/*7. Write a program to print the elements of the array which is divisible by 4. Take input
from the user.
Example: 
Enter size: 10 
14  20  18  9  11  51  16  2  8  10
Output: 
20 is divisible by 4 and its index is 1 
16 is divisible by 4 and its index is 6 
8 is divisible by 4 and its index is 8 */

import java.util.Scanner;

class DivisibleByFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (numbers[i] % 4 == 0) {
                System.out.println(numbers[i] + " is divisible by 4 and its index is " + i);
            }
        }

        scanner.close();
    }
}

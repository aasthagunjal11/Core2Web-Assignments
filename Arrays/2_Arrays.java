/*2. Take an input from the user where the size of the array should be 10 and print the
output of the user given elements of an array.*/

import java.util.Scanner;

class UserArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 elements:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Array elements:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

	System.out.println();

        scanner.close();
    }
}

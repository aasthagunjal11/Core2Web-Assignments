/*12.WAP to print the sum of elements divisible by 3 in the array, where you have to take
the size and elements from the user.
Example:
Enter size : 8 
9  13  5  13  6  22  36  10
output: 
Elements divisible by 3 : 9  6  36 
Sum of elements divisible by 3 is: 51*/

import java.util.Scanner;

class SumDivisibleByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;

        System.out.print("Elements divisible by 3: ");
        for (int i = 0; i < size; i++) {
            if (numbers[i] % 3 == 0) {
                System.out.print(numbers[i] + " ");
                sum += numbers[i];
            }
        }

        System.out.println("\nSum of elements divisible by 3 is: " + sum);

        scanner.close();
    }
}

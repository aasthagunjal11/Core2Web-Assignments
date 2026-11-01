/* 11.WAP to count the even numbers in an array where you have to take the size and
elements from the user. And also print the even numbers too
Example: 
Enter size =8 
1  12  55  65  44  22  36  10
Output : even numbers 12 44  22  36  10 
Count of even elements is : 5
*/

import java.util.Scanner;

class CountEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int count = 0;

        System.out.print("Even numbers: ");
        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
                count++;
            }
        }

        System.out.println("\nCount of even elements is: " + count);

        scanner.close();
    }
}

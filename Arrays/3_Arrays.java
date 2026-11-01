/*3. Write a program to print the even elements in the array. Take input from the user.
Example :
Enter size : 10 
Array:
10  11  12  13  14  15  16  17  18  19
Output : 
10 
12 
14 
16 
18 */

import java.util.Scanner;

class PrintEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Even elements:");
        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }

        scanner.close();
    }
}

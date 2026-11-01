/* 5. Write a program where you have to print the elements from the array which are less
than 10.Take input from the user.
Example: 
Enter size: 10 
11  2  18  9  10  5  16  20  8  10
Output :
2 is less than 10 
9 is less than 10 
5 is less than 10 
8 is less than 10 */

import java.util.Scanner;

class ElementsLessThanTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (numbers[i] < 10) {
                System.out.println(numbers[i] + " is less than 10");
            }
        }

        scanner.close();
    }
}

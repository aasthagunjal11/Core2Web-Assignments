/*9. Write a program where you have to print the odd indexed elements. Take input from
the user
Example :
Enter size: 10. 
1  2  3  4  5  6  7  8  9  10
2 is an odd indexed element
4 is an odd indexed element
6 is an odd indexed element
8 is an odd indexed element
10 is an odd indexed element
*/

import java.util.Scanner;

class PrintOddIndexedElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 1; i < size; i += 2) {
            System.out.println(numbers[i] + " is an odd indexed element");
        }

        scanner.close();
    }
}

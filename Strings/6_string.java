/*6. Write a program to input a String and print it in reverse order using a loop.
Example:
Input: Java → Output: avaJ*/

import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }

	System.out.println();

        scanner.close();
    }
}

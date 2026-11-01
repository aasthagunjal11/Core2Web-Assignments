/*1. Write a program to input a string and display its length.
Example:
Input: Hello
Output:
Length: 5*/

import java.util.Scanner;

class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        System.out.println("Length: " + text.length());

        scanner.close();
    }
}

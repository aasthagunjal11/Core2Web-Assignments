/*5. Write a program to input a String and print the first and last character of the string.
Example:
String: "Programming" → First: P , Last: g*/

import java.util.Scanner;

class FirstAndLastCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        if (text.length() > 0) {
            System.out.println("First: " + text.charAt(0));
            System.out.println("Last: " + text.charAt(text.length() - 1));
        } else {
            System.out.println("The string is empty.");
        }

        scanner.close();
    }
}

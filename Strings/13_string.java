/*13. Write a program to remove void spaces in the string
Input String: " Hello, World!
Output String: "Hello, World!"*/

import java.util.Scanner;

class RemoveOuterSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        System.out.println("Output String: \"" + text.trim() + "\"");

        scanner.close();
    }
}

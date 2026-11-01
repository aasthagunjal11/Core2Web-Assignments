/*8. Write a program to input a String and check if the string starts with “Hello”
Example:
Input: "HelloWorld"
Output: true*/

import java.util.Scanner;

class StartsWithHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        System.out.println(text.startsWith("Hello"));

        scanner.close();
    }
}

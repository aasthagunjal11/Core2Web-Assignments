/*9. Write a program to input a String and find the index of the first occurrence of ‘a’.
Example:
Input: "Java @ Core2web"
Output: 1
Input: “Core2web”
Output: -1*/

import java.util.Scanner;

class FindFirstA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        int index = text.indexOf('a');

        System.out.println(index);

        scanner.close();
    }
}

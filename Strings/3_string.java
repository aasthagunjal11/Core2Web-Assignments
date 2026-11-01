/*3. Write a program to input a String and find the character at a given index.
Example:
Input: Core2web
Index: 2
Output: r
import java.util.Scanner;*/

class CharacterAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        System.out.print("Enter an index: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < text.length()) {
            System.out.println("Character: " + text.charAt(index));
        } else {
            System.out.println("Invalid index.");
        }

        scanner.close();
    }
}

/*14. Write a program to replace all the ‘a’ with ‘e’ in a string
Input str = “We all appeared at American show.”
Output str = “We ell eppeered et Americen show”*/

import java.util.Scanner;

class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String result = text.replace('a', 'e');

        System.out.println("Output string: " + result);

        scanner.close();
    }
}

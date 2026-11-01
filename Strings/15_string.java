/*15. Write a program to split the String into words.
Input: I love Java
Output: I
love
Java*/

import java.util.Scanner;

class SplitStringIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        scanner.close();
    }
}

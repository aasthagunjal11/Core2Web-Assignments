/*18. Write a program to check if a sentence contains a substring using
toString().contains().
Input:
Enter a sentence:
Java programming is fun
Enter the substring to check:
Program
Output:
The sentence contains the substring "program".*/

import java.util.Scanner;

class CheckSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        System.out.println("Enter the substring to check:");
        String substring = scanner.nextLine();

        StringBuffer buffer = new StringBuffer(sentence);

        if (buffer.toString().contains(substring)) {
            System.out.println("The sentence contains the substring \"" + substring + "\".");
        } else {
            System.out.println("The sentence does not contain the substring \"" + substring + "\".");
        }

        scanner.close();
    }
}

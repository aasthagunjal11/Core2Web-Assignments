/*16. Write a program to check if a string is a palindrome using StringBuffer
Input: "madam"
Output: Palindrome*/

import java.util.Scanner;

class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        StringBuffer buffer = new StringBuffer(text);
        buffer.reverse();

        if (text.equals(buffer.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        scanner.close();
    }
}

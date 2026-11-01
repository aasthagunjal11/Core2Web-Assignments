/* 13.WAP to check if there is any vowel in the array of characters if present then print its
index, where you have to take the size and elements from the user.
Example: 
Input: 
Enter the size 
5 
Enter elements: 
arEKO 
Output: 
vowel a found at index 0 
vowel E found at index 2 
vowel O found at index 4 */

import java.util.Scanner;

class FindVowelsInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scanner.nextInt();

        char[] characters = new char[size];

        System.out.println("Enter " + size + " characters:");
        for (int i = 0; i < size; i++) {
            characters[i] = scanner.next().charAt(0);
        }

        for (int i = 0; i < size; i++) {
            char ch = characters[i];

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("Vowel " + ch + " found at index " + i);
            }
        }

        scanner.close();
    }
}

/*19. Write a program to check whether the given strings are anagrams or not.
Input: "listen", "silent"
Output: Anagram*/

import java.util.Scanner;

class CheckAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String first = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String second = scanner.nextLine();

        if (first.length() != second.length()) {
            System.out.println("Not anagram");
        } else {
            int[] counts = new int[65536];

            for (int i = 0; i < first.length(); i++) {
                counts[first.charAt(i)]++;
                counts[second.charAt(i)]--;
            }

            boolean isAnagram = true;

            for (int i = 0; i < counts.length; i++) {
                if (counts[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not anagram");
            }
        }

        scanner.close();
    }
}

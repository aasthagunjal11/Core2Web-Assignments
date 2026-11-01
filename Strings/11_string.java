/*11. Take two input strings str1 & str2 from the user and print 0 if both strings are equal,
else print the difference between the unequal elements.
Input: str1 = Amish
Str2 = Amash
Output:
Difference = 8;
Output:
Input: str1 = Java
str2 = Java
Difference = 0*/

import java.util.Scanner;

class StringDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        int difference = 0;
        int shorterLength;

        if (str1.length() < str2.length()) {
            shorterLength = str1.length();
        } else {
            shorterLength = str2.length();
        }

        for (int i = 0; i < shorterLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                difference += str1.charAt(i) - str2.charAt(i);
            }
        }

        for (int i = shorterLength; i < str1.length(); i++) {
            difference += str1.charAt(i);
        }

        for (int i = shorterLength; i < str2.length(); i++) {
            difference -= str2.charAt(i);
        }

        System.out.println("Difference = " + difference);

        scanner.close();
    }
}

/*12. Write a program to take two strings as input from the user and check whether those
string objects are equal or not. If they are qual print true else false
Ex 1:
Input: str1 = Java
str2 = JavaDSA
Output: false
Ex2:
Input: str1 = Java
Str2 = Java
Output: true*/

import java.util.Scanner;

class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        System.out.println(str1.equals(str2));

        scanner.close();
    }
}

/*10. Write a program to input the Strings to concatenate the strings given by the user and
count the length of the string after concatenation.
Input 1: Core2
Input 2: web
Output: Core2web
Length of String: 8*/

import java.util.Scanner;

class ConcatenateStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String first = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String second = scanner.nextLine();

        String result = first.concat(second);

        System.out.println(result);
        System.out.println("Length of String: " + result.length());

        scanner.close();
    }
}

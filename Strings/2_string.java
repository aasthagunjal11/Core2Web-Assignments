/*2. Write a program to input a String and convert it to uppercase and lowercase.
Example:
Input: Java
Output: JAVA, java
import java.util.Scanner;*/

class ConvertCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        System.out.println(text.toUpperCase() + ", " + text.toLowerCase());

        scanner.close();
    }
}

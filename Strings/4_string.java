/*4. Write a program to input a String and check string equality, ignoring case.
Example:
Input: hello, Hello → Output: Equal*/
import java.util.Scanner;

class CheckStringEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String first = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String second = scanner.nextLine();

        if (first.equals(second)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        scanner.close();
    }
}

/*6. Write a program where you have to take input from the user for a character array and
print the characters.*/

import java.util.Scanner;

class PrintCharacterArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the character array: ");
        int size = scanner.nextInt();

        char[] characters = new char[size];

        System.out.println("Enter " + size + " characters:");
        for (int i = 0; i < size; i++) {
            characters[i] = scanner.next().charAt(0);
        }

        System.out.println("Characters in the array:");
        for (int i = 0; i < size; i++) {
            System.out.println(characters[i]);
        }

        scanner.close();
    }
}

/*14.WAP to search a specific element in an array and return its index. Ask the user to
provide the number to search, also take size and elements input from the user.
Example: 
Input: 
Enter the size 
5 
Enter elements: 
12
144 
13 
156 
8 
Enter the number to search in array: 
8 
Output: 
8 found at index 4*/

import java.util.Scanner;

class SearchArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int searchNumber = scanner.nextInt();

        int foundIndex = -1;

        for (int i = 0; i < size; i++) {
            if (numbers[i] == searchNumber) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println(searchNumber + " found at index " + foundIndex);
        } else {
            System.out.println(searchNumber + " was not found in the array.");
        }

        scanner.close();
    }
}

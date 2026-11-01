/*17.WAP to print the array , if the user given size of an array is even then print the
alternate elements in an array, else print the whole array.
Example 1: 
Input: 
Enter the size 
5 
Enter elements: 
1 
2 
3 
4 
5 
Output: 
Array elements are: 
1 
2 
3 
4 
5
Example 2: 
Input: 
Enter the size 
4 
Enter elements: 
1 
2 
3 
4 
Output
Array elements are: 
1 
3*/



import java.util.Scanner;

class PrintArrayConditionally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Array elements are:");

        if (size % 2 == 0) {
            for (int i = 0; i < size; i += 2) {
                System.out.println(numbers[i]);
            }
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(numbers[i]);
            }
        }

        scanner.close();
    }
}

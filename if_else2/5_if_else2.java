/*5. Write a program to check whether the given float value is divisible by 6 or not. (T ake
float input from the user)
Input 1: floatNum = 120; 
Output: 120 is divisible by 6.
Input 2: floatNum = 89.96; 
Output: 89.96 is not divisible by 6.*/

import java.util.Scanner;

class CheckFloatDivisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a float value: ");
        float floatNum = scanner.nextFloat();

        if (floatNum % 6 == 0) {
            System.out.println(floatNum + " is divisible by 6.");
        } else {
            System.out.println(floatNum + " is not divisible by 6.");
        }

        scanner.close();
    }
}

/*Q8. Write a program that takes two numbers from the user. If both the numbers are
positive multiply them and provide a switch case to verify whether the calculated
number is even or odd, if the user enters any negative number, the program should
terminate by saying “Sorry negative numbers are not allowed”.
Now you have to use if else and switch both in the same code*/

import java.util.Scanner;

class MultiplyAndCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (num1 < 0 || num2 < 0) {
            System.out.println("Sorry, negative numbers are not allowed");
        } else {
            int product = num1 * num2;
            System.out.println("Product: " + product);

            switch (product % 2) {
                case 0:
                    System.out.println("The product is even");
                    break;
                case 1:
                    System.out.println("The product is odd");
                    break;
            }
        }

        scanner.close();
    }
}

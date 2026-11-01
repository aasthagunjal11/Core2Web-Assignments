/*9.  W AP to print whether the number is Automorphic number 
Input: 25
Output:  25 is Automorphic*/

import java.util.Scanner;

class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int square = number * number;
        int temp = number;
        int placeValue = 1;

        while (temp > 0) {
            placeValue *= 10;
            temp /= 10;
        }

        if (square % placeValue == number) {
            System.out.println(number + " is Automorphic");
        } else {
            System.out.println(number + " is not Automorphic");
        }

        scanner.close();
    }
}

/*9. Write a program in Java to accept three numbers and check whether they are
Pythagorean triplets or not.(T ake number input from user)
Example:
a=3, b=4,c=5
If
a*a+b*b =c*c 
Its pythagorean triplet 
Else
Not a pythagorean triplet
Input: 
a=3,b=4,c=5 
Output : it is a pythagorean triplet
Input: 
a=2,b=2,c=2 
Output : it is not a pythagorean triplet*/

import java.util.Scanner;

class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((long) a * a + (long) b * b == (long) c * c
                || (long) a * a + (long) c * c == (long) b * b
                || (long) b * b + (long) c * c == (long) a * a) {
            System.out.println("It is a Pythagorean triplet");
        } else {
            System.out.println("It is not a Pythagorean triplet");
        }

        scanner.close();
    }
}

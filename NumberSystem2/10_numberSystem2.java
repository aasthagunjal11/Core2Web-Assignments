/*10.  W AP to print whether the number is Happy number 
Input :  49
Output : 49 is a happy number
Happy number*/
import java.util.Scanner;

class HappyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int current = number;

        while (current != 1 && current != 4) {
            int sum = 0;

            while (current > 0) {
                int digit = current % 10;
                sum += digit * digit;
                current /= 10;
            }

            current = sum;
        }

        if (current == 1) {
            System.out.println(number + " is a happy number");
        } else {
            System.out.println(number + " is not a happy number");
        }

        scanner.close();
    }
}

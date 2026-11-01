/*8. W AP to print the armstrong number in the user given range .
Input:
start: 1 
end: 20 
Output:
1, 2, 3, 4, 5, 6, 7, 8, 9
*/

import java.util.Scanner;

class ArmstrongNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = scanner.nextInt();

        System.out.print("Enter end: ");
        int end = scanner.nextInt();

        System.out.print("Armstrong numbers: ");
        boolean first = true;

        for (int number = start; number <= end; number++) {
            if (number < 0) {
                continue;
            }

            int digits = 0;
            int temp = number;

            if (temp == 0) {
                digits = 1;
            } else {
                while (temp > 0) {
                    digits++;
                    temp /= 10;
                }
            }

            int sum = 0;
            temp = number;

            do {
                int digit = temp % 10;
                int power = 1;

                for (int i = 1; i <= digits; i++) {
                    power *= digit;
                }

                sum += power;
                temp /= 10;
            } while (temp > 0);

            if (sum == number) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(number);
                first = false;
            }
        }
        System.out.println();
        scanner.close();
    }
}

/*7.  W AP to print the Strong numbers in a user given range. 
Input :
start:1
end:10 
Output:
1, 2
*/

import java.util.Scanner;

class StrongNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = scanner.nextInt();

        System.out.print("Enter end: ");
        int end = scanner.nextInt();

        System.out.print("Strong numbers: ");
        boolean first = true;

        for (int number = start; number <= end; number++) {
            if (number < 0) {
                continue;
            }

            int temp = number;
            int sum = 0;

            if (temp == 0) {
                sum = 1;
            } else {
                while (temp > 0) {
                    int digit = temp % 10;
                    int factorial = 1;

                    for (int i = 1; i <= digit; i++) {
                        factorial *= i;
                    }

                    sum += factorial;
                    temp /= 10;
                }
            }

            if (sum == number) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(number);
                first = false;
            }
        }

        scanner.close();
    }
}

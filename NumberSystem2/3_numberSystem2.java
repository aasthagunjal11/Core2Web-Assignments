/*
 * 3.  W AP to print the Abundant numbers in the user given range .
Input:
start : 1
end : 30
Output:
12, 18, 20, 24, 30
*/

import java.util.Scanner;

class AbundantNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = scanner.nextInt();

        System.out.print("Enter end: ");
        int end = scanner.nextInt();

        System.out.print("Abundant numbers: ");
        boolean first = true;

        for (int number = start; number <= end; number++) {
            int divisorSum = 0;

            for (int divisor = 1; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    divisorSum += divisor;
                }
            }

            if (divisorSum > number) {
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

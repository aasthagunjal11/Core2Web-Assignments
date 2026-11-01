/*
 * 2.  W AP to print the Deficient numbers in a user given range.
Input :
start:1
end:10
Output:
1, 2, 3, 4, 5, 7, 8, 9
*/

import java.util.Scanner;

class DeficientNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = scanner.nextInt();

        System.out.print("Enter end: ");
        int end = scanner.nextInt();

        System.out.print("Deficient numbers: ");
        boolean first = true;

        for (int number = start; number <= end; number++) {
            int divisorSum = 0;

            for (int divisor = 1; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    divisorSum += divisor;
                }
            }

            if (number > 0 && divisorSum < number) {
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

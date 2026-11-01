/*1.  W AP to print the Perfect numbers in the user given range. 
Input :
start:1
end:30 
Output:
6, 28
*/

import java.util.Scanner;

class PerfectNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = scanner.nextInt();

        System.out.print("Enter end: ");
        int end = scanner.nextInt();

        System.out.print("Perfect numbers: ");

        boolean first = true;

        for (int number = start; number <= end; number++) {
            int sum = 0;

            for (int divisor = 1; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    sum += divisor;
                }
            }

            if (number > 0 && sum == number) {
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

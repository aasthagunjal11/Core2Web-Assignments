/*5.  W AP to print the Harshad/ Niven number in a user given range. 
Input:
start: 1 
end: 50 
Output:
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18
*/

import java.util.Scanner;

class HarshadNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = scanner.nextInt();

        System.out.print("Enter end: ");
        int end = scanner.nextInt();

        System.out.print("Harshad numbers: ");
        boolean first = true;

        for (int number = start; number <= end; number++) {
            if (number <= 0) {
                continue;
            }

            int temp = number;
            int digitSum = 0;

            while (temp > 0) {
                digitSum += temp % 10;
                temp /= 10;
            }

            if (number % digitSum == 0) {
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


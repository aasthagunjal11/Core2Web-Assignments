/*4.  W AP to print the Duck Numbers in a given range. 
Input:
start: 1 
end: 50 
Output:
10, 20, 30, 40, 50
*/

import java.util.Scanner;

class DuckNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = scanner.nextInt();

        System.out.print("Enter end: ");
        int end = scanner.nextInt();

        System.out.print("Duck numbers: ");
        boolean first = true;

        for (int number = start; number <= end; number++) {
            int temp = number;
            boolean hasZero = false;

            while (temp > 0) {
                if (temp % 10 == 0) {
                    hasZero = true;
                    break;
                }
                temp /= 10;
            }

            if (hasZero) {
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

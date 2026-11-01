/*7. Write a program to print a table of ‘N’. Where N is user given number. 
Input: 
N=17
Output: 17,34,51,68,...170*/

import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.print(n * i);

            if (i < 10) {
                System.out.print(", ");
            }
        }
        System.out.println();
        scanner.close();
    }
}

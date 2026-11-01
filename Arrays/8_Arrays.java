/*8. Write a program where you have to store the employee’s age working at a company,
take count of employees from the user.Take input from the user.*/

import java.util.Scanner;

class EmployeeAges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int count = scanner.nextInt();

        int[] ages = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter age of employee " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        System.out.println("Employee ages:");
        for (int i = 0; i < count; i++) {
            System.out.println("Employee " + (i + 1) + ": " + ages[i]);
        }

        scanner.close();
    }
}

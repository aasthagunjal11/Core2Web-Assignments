/*8. Write a program to check whether the student passed with:
first class with distinction, first class, second class, pass and fail according to his percent
grades. (Y ou have to adjust range by your own for first class, second class and for pass.
Also take percent input from user)
Input 1: percent= 85.00 
Output: Passed : first class with distinction
Input 2: percent=75.00 
Output: Passed : first class with distinction
Input 3: percent=60.00 
Output: Passed : first class
Input 4: percent=54.00 
Output: Passed : second class
Input: percent=47 
Output: Pass */

import java.util.Scanner;

class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter percentage: ");
        double percent = scanner.nextDouble();

        if (percent >= 75 && percent <= 100) {
            System.out.println("Passed: first class with distinction");
        } else if (percent >= 60) {
            System.out.println("Passed: first class");
        } else if (percent >= 50) {
            System.out.println("Passed: second class");
        } else if (percent >= 35) {
            System.out.println("Pass");
        } else if (percent >= 0) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid percentage");
        }

        scanner.close();
    }
}

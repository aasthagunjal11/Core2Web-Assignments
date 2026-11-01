/*Q2.Write a program to print Remarks according to their respective grades. 
Input: O 
Output: Outstanding
Input: A
Output: Excellent*/

import java.util.Scanner;

class GradeRemarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter grade: ");
        char grade = scanner.next().charAt(0);

        switch (grade) {
            case 'O':
                System.out.println("Outstanding");
                break;
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }

        scanner.close();
    }
}

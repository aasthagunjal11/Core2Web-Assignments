/* 10. Write a real-time example where you have to use the array. Take input from the user.*/

import java.util.Scanner;

class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int count = scanner.nextInt();

        int[] marks = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        System.out.println("\nStudent marks:");
        for (int i = 0; i < count; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        scanner.close();
    }
}

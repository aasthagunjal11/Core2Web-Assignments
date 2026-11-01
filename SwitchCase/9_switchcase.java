/*Q9. Write a program in which students should enter marks for 5 different subjects.
If all subjects have the above passing marks add them and provide a switch case to
print grades(first class with distinction, first class, second class), if a student gets a
fail in any subject, the program should print “Y ou failed the exam”.
Now you have to use if else and switch both in the same code
*/

import java.util.Scanner;

class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        boolean passedAllSubjects = true;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();

            if (marks < 35 || marks > 100) {
                passedAllSubjects = false;
            }

            total += marks;
        }

        if (!passedAllSubjects) {
            System.out.println("You failed the exam");
        } else {
            int percentage = total / 5;
            int gradeCategory;

            if (percentage >= 75) {
                gradeCategory = 1;
            } else if (percentage >= 60) {
                gradeCategory = 2;
            } else if (percentage >= 35) {
                gradeCategory = 3;
            } else {
                gradeCategory = 0;
            }

            switch (gradeCategory) {
                case 1:
                    System.out.println("First class with distinction");
                    break;
                case 2:
                    System.out.println("First class");
                    break;
                case 3:
                    System.out.println("Second class");
                    break;
                default:
                    System.out.println("You failed the exam");
            }
        }

        scanner.close();
    }
}

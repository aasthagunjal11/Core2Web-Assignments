/*Q3.Write a program to print long-form cloth sizes according to their acronym. 
Input: S 
Output: Small
Input: XL
Output: Extra Large*/

import java.util.Scanner;

class ClothSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size acronym: ");
        String size = scanner.nextLine();

        switch (size) {
            case "S":
                System.out.println("Small");
                break;
            case "M":
                System.out.println("Medium");
                break;
            case "L":
                System.out.println("Large");
                break;
            case "XL":
                System.out.println("Extra Large");
                break;
            case "XXL":
                System.out.println("Double Extra Large");
                break;
            default:
                System.out.println("Invalid size");
        }

        scanner.close();
    }
}

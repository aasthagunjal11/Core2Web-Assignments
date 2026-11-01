/*Q1. Write a program to print the meaning of a specific color in a traffic light. 
Input: Red 
Output: Stop
Input: Blue 
Output: No such color is present in traffic lights. */

import java.util.Scanner;

class TrafficLightMeaning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a traffic light color: ");
        String color = scanner.nextLine();

        switch (color) {
            case "Red":
                System.out.println("Stop");
                break;
            case "Yellow":
                System.out.println("Wait");
                break;
            case "Green":
                System.out.println("Go");
                break;
            default:
                System.out.println("No such color is present in traffic lights.");
        }

        scanner.close();
    }
}

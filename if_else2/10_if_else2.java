/*10. Write a program, where you have to write a real-time example. (It should be unique
and thought on your own, take input from the user)*/

import java.util.Scanner;

class DeliveryLoadCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the van's maximum load capacity in kg: ");
        double capacity = scanner.nextDouble();

        System.out.print("Enter the shipment weight in kg: ");
        double shipmentWeight = scanner.nextDouble();

        if (capacity <= 0 || shipmentWeight < 0) {
            System.out.println("Please enter valid weights.");
        } else if (shipmentWeight <= capacity) {
            System.out.println("The van can carry the shipment.");
            System.out.println("Available capacity: " + (capacity - shipmentWeight) + " kg");
        } else {
            System.out.println("The shipment is too heavy for the van.");
            System.out.println("Weight over capacity: " + (shipmentWeight - capacity) + " kg");
        }

        scanner.close();
    }
}

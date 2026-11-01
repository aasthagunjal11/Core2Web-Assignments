/*7. Calculate the profit or loss. 
Write a program that takes the cost price and selling price and calculates its profit or
loss.(T ake the cost price and selling price from the user)
Input 1:
sellingPrice: 1200
costPrice: 1000
Output: Profit of 200
Input 2:
sellingPrice: 300 
costPrice: 500
Output: loss of 200
Input 3: 
sellingPrice: 900 
costPrice: 900 
Output: No profit no loss*/

import java.util.Scanner;

class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter selling price: ");
        double sellingPrice = scanner.nextDouble();

        System.out.print("Enter cost price: ");
        double costPrice = scanner.nextDouble();

        if (sellingPrice > costPrice) {
            System.out.println("Profit of " + (sellingPrice - costPrice));
        } else if (costPrice > sellingPrice) {
            System.out.println("Loss of " + (costPrice - sellingPrice));
        } else {
            System.out.println("No profit no loss");
        }

        scanner.close();
    }
}

/*Q7. Write a program for the below example. 
If you like to watch movies and you are planning to buy a Subscription according
to the plan
For the Platinum plan, the price is 799 
For Gold plan, the price is 599 
For the Silver plan, the price is 399 
For the Bronze plan, the price is 199
For less than 199, the platform is free with limited access
Display these plans to the user and ask for their plan
1.  Platinum 
2.  Gold 
3.  Silver
4.  Bronze
5.  free
Input: Enter your plan: Silver 
Output :
For the Silver plan, the price is ₹399
Input: Enter your plan: free 
Output :
For less than ₹199, the platform is free with limited access
Input: Enter your plan: no 
Output :
Invalid Input*/

import java.util.Scanner;

class MovieSubscription {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a plan:");
        System.out.println("1. Platinum");
        System.out.println("2. Gold");
        System.out.println("3. Silver");
        System.out.println("4. Bronze");
        System.out.println("5. Free");

        System.out.print("Enter your plan: ");
        String plan = scanner.nextLine();

        switch (plan) {
            case "Platinum":
                System.out.println("For the Platinum plan, the price is ₹799");
                break;
            case "Gold":
                System.out.println("For the Gold plan, the price is ₹599");
                break;
            case "Silver":
                System.out.println("For the Silver plan, the price is ₹399");
                break;
            case "Bronze":
                System.out.println("For the Bronze plan, the price is ₹199");
                break;
            case "free":
                System.out.println("For less than ₹199, the platform is free with limited access");
                break;
            default:
                System.out.println("Invalid Input");
        }

        scanner.close();
    }
}

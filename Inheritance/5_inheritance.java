import java.util.*;
class Account{
    int accountNumber;
    String holderName;

    Account(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    void displayAccountDetails() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Holder name: " + holderName);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(int accountNumber, String holderName, double interestRate) {
        super(accountNumber, holderName);
        this.interestRate = interestRate;
    }

    void calculateInterest(double balance) {
        double interest = balance * interestRate / 100;

        displayAccountDetails();
        System.out.println("Balance: " + balance);
        System.out.println("Interest rate: " + interestRate + "%");
        System.out.println("Interest: " + interest);
    }
}

class Client{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Accout Details: ");
      System.out.println("Account Number: ");
      int accNo = sc.nextInt();
      System.out.println("Holder Name: ");
      String holderName = sc.next();
      System.out.println("Interest Rate: ");
      double interestRate = sc.nextDouble();

      
      SavingsAccount savingsAccount = new SavingsAccount(accNo,holderName,interestRate);
      savingsAccount.calculateInterest(5000);

   }
}

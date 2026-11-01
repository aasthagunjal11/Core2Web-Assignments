import java.util.*;
class Invoice{
    int invoiceId;
    String customerName;
    double totalAmount;
    Invoice(int invoiceId,String customerName, double totalAmount){
      this.invoiceId = invoiceId;
      this.customerName = customerName;
      this.totalAmount = totalAmount;
    }

    void finalBill(double gstRate){
        double gst = totalAmount * gstRate / 100;
	double bill = totalAmount+gst;

	System.out.println("Invoice ID: "+invoiceId);
	System.out.println("Customer Name: "+customerName);
	System.out.println("Final Bill with GST: "+bill);

    }
}
class Client{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Invoice ID: ");
     int invoiceId = sc.nextInt();
     System.out.print("Enter Customer Name: ");
     String customerName = sc.next();
     System.out.print("Enter total Amount: ");
     double totalAmount = sc.nextDouble();
     Invoice invoice = new Invoice(invoiceId,customerName,totalAmount);
     invoice.finalBill(18);
   }
}

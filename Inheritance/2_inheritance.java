import java.util.*;
class FlightTicket{
    int ticketNo;
    String passangerName;
    String seatClass;

    FlightTicket(int ticketNo, String passangerName, String seatClass){
         this.ticketNo = ticketNo;
	 this.passangerName = passangerName;
	 this.seatClass = seatClass;
    }

    void calculateExtraCharges(){
        double charges = 0;
	switch(seatClass){
	  case "Economy":
		  charges = 0;
		  break;
	  case "Business":
		  charges = 5000;
		  break;
	  case "First":
		 charges = 10000;
		 break;
	  default:
		System.out.println("Invalid seat class");
	        return;	
	}

	System.out.println("Ticket No: " +ticketNo);
	System.out.println("Passanger Name: " +passangerName);
	System.out.println("Seat Class: " +seatClass);
	System.out.println("Extra Charges: " +charges);
    }
}

class Client{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Ticket No: ");
    int ticketNo = sc.nextInt();
    System.out.print("Enter Passanger Name: ");
    String passangerName = sc.next();
    System.out.print("Enter Seat Class: ");
    String seatClass = sc.next();

    FlightTicket flightTicket = new FlightTicket(ticketNo,passangerName, seatClass);
    flightTicket.calculateExtraCharges();
  }
}

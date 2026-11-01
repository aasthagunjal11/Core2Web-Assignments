import java.util.*;
class Event{
	String eventName;
	String location;

	Event(String eventName, String location){
	   this.eventName = eventName;
	   this.location = location;
	}

	void displayEvent(){
	   System.out.println("Event Name: "+eventName);
	   System.out.println("Location: "+location);
	}
}

class SportsEvent extends Event{
    String sportsType;
    SportsEvent(String eventName, String location, String sportsType){
      super(eventName, location);
      this.sportsType = sportsType;
    }

    void displayFullEventInfo(){
	    displayEvent();
	    System.out.println("Sports Type: "+sportsType);
    }

}

class Client{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Sports Event Details:");
      System.out.print("Enter Event Name: ");
      String eventName = sc.next();
      System.out.print("Enter Location: ");
      String location = sc.next();
      System.out.print("Enter Sports Type: ");
      String sportsType = sc.next();

      SportsEvent sportsEvent = new SportsEvent(eventName, location, sportsType);
      sportsEvent.displayFullEventInfo();
   }
}

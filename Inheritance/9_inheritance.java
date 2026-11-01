import java.util.*;
class Artist {
    String name;
    int age;

    Artist(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Musician extends Artist {
    String instrument;

    Musician(String name, int age, String instrument) {
        super(name, age);
        this.instrument = instrument;
    }

    void perform() {
        System.out.println(name + " is performing on the " + instrument);
    }   
}

class Client{
   public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Musician Details: ");
	   System.out.println("Enter Artist Name: ");
	   String artistName = sc.next();
	   System.out.println("Enter Artist Age: ");
	   int artistAge = sc.nextInt();
	   System.out.println("Enter Instrument: ");
	   String instrument = sc.next();

	   Musician musician = new Musician(artistName, artistAge, instrument);
	   musician.perform();
   }
}

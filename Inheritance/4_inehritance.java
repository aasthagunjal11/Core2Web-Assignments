import java.util.*;
class Vehicle{
    String brand;
    String model;

    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void displayVehicleDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle {
    double price;
    String fuelType;

    Car(String brand, String model, double price, String fuelType) {
        super(brand, model);
        this.price = price;
        this.fuelType = fuelType;
    }

    void displayCarDetails() {
        displayVehicleDetails();
        System.out.println("Price: " + price);
        System.out.println("Fuel type: " + fuelType);
    }
}

class Client{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Fill the Car Details");
      System.out.print("Car brand: ");
      String brand = sc.next();
      System.out.print("Car model: ");
      String model = sc.next();
      System.out.print("Car price: ");
      double price = sc.nextDouble();
      System.out.print("Car fuel type: ");
      String fuelType = sc.next();

      Car car = new Car(brand,model,price,fuelType);
      car.displayCarDetails(); 
   }
}

import java.util.*;
class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(String color, double length, double breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea() {
        return length * breadth;
    }

    void displayDetails() {
        displayColor();
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + calculateArea());
    }
}

class Client{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Rectangle Shape Details:");
      System.out.print("Enter Length: ");
      double length = sc.nextDouble();
      System.out.print("Enter Breadth: ");
      double breadth = sc.nextDouble();
      System.out.print("Enter Color: ");
      String color = sc.next();

      Rectangle rectangle = new Rectangle(color, length, breadth);
      rectangle.displayDetails();

   }
}

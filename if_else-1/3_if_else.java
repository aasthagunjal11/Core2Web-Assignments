import java.util.*;
class NumDemo{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number to check whether it is greater or less than 10");
     int num = sc.nextInt();
     if(num>10){
       System.out.println(num+" is greater than 10");
     }else if(num<10){
       System.out.println(num+" is less than 10");
     }else{
       System.out.println(num+ " is equal to 10");
     }
  }
}

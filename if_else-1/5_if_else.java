import java.util.*;
class DivisibleBy{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number to check whether it is divisible by 7 or not: ");
     int num = sc.nextInt();
     if(num%7 == 0){
        System.out.println(num+" is divisible by 7");
     }else{
        System.out.println(num+" is not divisible by 7");
     }
  }
}

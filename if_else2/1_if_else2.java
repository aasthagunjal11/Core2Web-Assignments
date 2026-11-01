/* 1. Write a program to check whether the given number is in the range of 1 to 1000 or not.
(T ake integer input from the user)
Input 1: num = 100; 
Output: 100 is in the range 1 to 1000.
Input 2:  num = 0; 
Output: 0 is not in the range 1 to 1000.
Input 3:  num = -11; 
Output: -11 is not in the range 1 to 1000.
*/
import java.util.*;
class RangeDemo{
  public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter a number:");
     int num = scanner.nextInt();
     if(num >= 1 && num<= 100){
       System.out.println(num+" is in the range 1 to 100");
     }else{
       System.out.println(num+ " is not in range 1 to 100");
     }

     scanner.close();
  }
}

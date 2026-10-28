import java.util.*;
class DivisibleBy{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number: ");
     int num = sc.nextInt();
     if(num%2 == 0 && num%5==0 && num%10==0){
        System.out.println(num+" is divisible by 2,5 and 10.");
     }else{
        System.out.println(num+ " is not divisible by 2,5 and 10");
     }
   }
}

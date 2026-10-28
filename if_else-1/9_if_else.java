import java.util.*;
class WeekDays{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number between 1-7 to get a day: ");
     int num = sc.nextInt();
     if(num == 1){
       System.out.println("Monday");
     }else if(num == 2){
       System.out.println("Tuesday");
     }else if(num == 3){
       System.out.println("Wedneday");
     }else if(num == 4){
       System.out.println("Thursday");
     }else if(num == 5){
        System.out.println("Friday");
     }else if(num == 6){
       System.out.println("Saturday");
     }else if(num == 7){
       System.out.println("Sunday");
     }else{
        System.out.println("day number must be between 1 to 7 !!!");
     }
   }
}

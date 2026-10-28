import java.util.*;
class OddEvenNum{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check whether it is odd or even: ");
    int num = sc.nextInt();
    if(num%2 == 0){
      System.out.println(num+" is an even number"); 
    }else{
      System.out.println(num+ " is an odd number");
    }
  }
}

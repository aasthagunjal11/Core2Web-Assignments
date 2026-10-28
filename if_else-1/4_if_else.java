import java.util.*;
class AlphabetDemo{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an alphabet to check whether it is capital or small: ");
    char ch = sc.next().charAt(0);
    if(ch >= 65 && ch <= 90){
      System.out.println(ch+ " is an uppercase alphabet");
    }else if(ch >= 95 && ch<= 122){
      System.out.println(ch+ " is a lowercase alphabet");
    }else{
      System.out.println(ch+" is not a alphabet");
    }
  }
}

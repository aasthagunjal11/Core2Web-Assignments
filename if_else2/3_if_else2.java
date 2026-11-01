/*3. Write a program to check whether the given character is a vowel or consonant.(T ake
hard coded values)
Input 1: ‘a’
Output: a is vowel
Input 2: ‘D’
Output: D is consonant*/

import java.util.*;
class AlphabetDemo{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an alphabet:");
    char ch = sc.next().charAt(0);    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
    System.out.println(ch+" is vowel");
    }else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
    System.out.println(ch+" is consonant");
    }else{
    System.out.println("Please try to give alphabet !!!");
    }
   }
}

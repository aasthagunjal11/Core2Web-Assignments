/*2. Write a program to check whether the given number is in the table of 13 or not.(T ake
integer input from the user)
Input 1: num =156; 
Output: 156 is in the table of 13
Input 2: num =144; 
Output: 144 is not in the table of 13
*/

import java.util.*; 
class TableDemo{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a num:");
      int num = scanner.nextInt();
      if(num%13==0){
       System.out.println(num+ " is in the table of 13");
      }else{
       System.out.println(num+ " is not in the table of 13");
      }

      scanner.close();
   }
}

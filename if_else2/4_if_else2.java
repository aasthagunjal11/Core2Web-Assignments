/*4. A student who has passed his 12th standard exam, he thinks he might get marks up to 85
percent. Suggest a better career field depending upon the marks assumption.
Input 1: percentage >85.00; 
Output: Medical
Input 2: percentage  <=85.00 and percentage >75.00; 
Output: Engineering;
Input 1: percentage<=75.00 and percentage>=65.00; 
Output: pharmacy or bachelor in science;
Y ou have to write the code using different values of percentage.*/

import java.util.*;
class PercentageDemo{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the percentage: ");
    float percentage = scanner.nextFloat();
    if(percentage>85){
      System.out.println("Medical");
    }else if(percentage<=85 && percentage>75){
      System.out.println("Engineering");
    }else if(percentage<=75 && percentage>=65){
      System.out.println("pharmacy or bachelor in science");
    }else{
      System.out.println("very low marks!");
    }
    scanner.close();
  }
}

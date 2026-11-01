/*17. Write a Java program that takes a comma-separated list of words as input and uses
StringTokenizer to extract and print each word after trimming any extra spaces.
Input: apple,banana,orange,mango,grape
Output:
apple
banana
orange
mango
Grape*/

import java.util.Scanner;
import java.util.StringTokenizer;

class TokenizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter comma-separated words: ");
        String input = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(input, ",");

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken().trim();
            System.out.println(word);
        }

        scanner.close();
    }
}

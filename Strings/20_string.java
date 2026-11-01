/*20. Write a program to reverse each word in a sentence using a StringBuffer.
Input: "Java Code"
Output: "avaJ edoC*/

import java.util.*;

class ReverseEachWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(sentence);
        StringBuffer result = new StringBuffer();

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            StringBuffer wordBuffer = new StringBuffer(word);

            result.append(wordBuffer.reverse());

            if (tokenizer.hasMoreTokens()) {
                result.append(" ");
            }
        }

        System.out.println(result);

        scanner.close();
    }
}

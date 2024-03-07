/*7. Write a program to replace a given substring in a sentence with another string. For example, in the sentence, ” A batman with bat” if we replace ”bat” with ”snow”, the new sentence should be printed as ”A snowman with snow”.*/
import java.util.Scanner;
public class Replace7.java {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String s =sc.nextLine();
        System.out.println("Enter the substitute word: ");
        String sub =sc.nextLine();
        System.out.println("Enter the replace word : ");
        String replacement =sc.nextLine();
        String result = replaceSubstring(s, sub, replacement);
        System.out.println("New sentence: " + result);
    }
    private static String replaceSubstring(String sentence, String oldSubstring, String newSubstring) {
        StringBuilder result = new StringBuilder();
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.equals(oldSubstring)) {
                result.append(newSubstring).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }
}

/*4. Write a program to check if a given string is a Palindrome.
A palindrome reads same from front and back e.g.- aba, ccaacc, mom, etc.*/
import java.util.Scanner;
public class Assignment5D3
{
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        StringBuilder modifiedString = new StringBuilder();
        for (String word : words) {
            if(palindrome(word)) {
                modifiedString.append("*".repeat(word.length())).append(" ");
            } else {
                modifiedString.append(word).append(" ");
            }
        }
        modifiedString.deleteCharAt(modifiedString.length() - 1);
        System.out.println(modifiedString.toString());
    }
  public static boolean palindrome(String s){
      char []ch=s.toCharArray();
      int i=0,j=ch.length-1;
      while(i<j){
          if(ch[i]!=ch[j])return false;
          i++;
          j--;
      }
      return true;
  }
}

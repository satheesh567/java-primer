/*4. Write a program to check if a given string is a Palindrome.
A palindrome reads same from front and back e.g.- aba, ccaacc, mom, etc.*/
import java.util.Scanner;
public class Palidrome4
{
public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String str = scanner.nextLine();
         if(palindrom(str))
             System.out.println(str+" is a palindrome");
         else
           System.out.println(str+" is not a palindrome");
  }
  public static boolean palindrom(String s){
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

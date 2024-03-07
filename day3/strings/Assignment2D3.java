/*2. Write a program that takes your full name as input and displays the abbreviations of the first and middle names except the last name which is displayed as it is. For example, if your name is Robert Brett Roser, then the output should be R.B.Roser.*/

import java.util.Scanner;
public class Assignment2D3
{
public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        String[] parts = fullName.split(" ");
        String s="";
        for(int i=0;i<parts.length-1;i++){
            s=s+parts[i].charAt(0)+".";
        }
        s=s+parts[parts.length-1];
        System.out.println(s);
  }
}
/*10. Write a program to reverse a 3-digit number. 
E.g.-Number : 132        Output : 231
Input the number using scanner.*/


import java.util.*;
class Assignment10{
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num=sc.nextInt();
    int rev=0;
    while(num>0){
       rev=rev*10+num%10;
       num=num/10;
     }
    System.out.println("output : "+(rev));
 }
}
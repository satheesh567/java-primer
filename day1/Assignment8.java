/*8. Write a program to calculate the sum of the first and the second last digit of a 5 digit.
E.g.- NUMBER : 12345        OUTPUT : 1+4=5 
Input the number using scanner.*/
import java.util.*;
class Assignment8{
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num=sc.nextInt();
    int last=num%10;
    int first=num/10000;
    System.out.println("output : "+(first+last));
 }
}

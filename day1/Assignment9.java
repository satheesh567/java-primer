 
/*9. Write a program to calculate the sum of the digits of a 3-digit number.
Number : 132        Output : 6
Input the number using scanner.*/

import java.util.*;
class Assignment9{
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num=sc.nextInt();
    int sum=0;
    while(num>0){
       sum=sum+num%10;
       num=num/10;
     }
    System.out.println("output : "+(sum));
 }
}
/*5. Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two programs to swap the values of the two variables.*/
import java.util.*;
class Assignment5{
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
  System.out.println("Enter 'a' value : ");
   int a=sc.nextInt();
   System.out.println("Enter 'b' value : ");
    int b=sc.nextInt();
    int temp=a;
     a=b;
     b=temp;
   System.out.println("After swapping a="+a+","+"b="+b);
   swap(a,b);
    
 }
 public static void swap(int a,int b){
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("After swapping with out third variable a="+a+","+"b="+b);
 } 
}
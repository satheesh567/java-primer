/*5. Write a program to find the sum and product of all elements of an array.*/
import java.util.Scanner;
public class Assignment5
{
	public static void main(String[] args) {
	     int[] arr=new int[10];
	     int sum=0;
	     int prod=1;
	     Scanner sc=new Scanner(System.in);
	      System.out.println("Enter 10 number : ");
	     for(int i=0;i<arr.length;i++){
	         arr[i]=sc.nextInt();
	     }
	     for(int i=0;i<arr.length;i++){
	         sum=sum+arr[i];
	         prod=prod*arr[i];
	     }
	   System.out.println("sum of all number : "+sum);
	   System.out.println("product of all number : "+prod);
	   
	     
	}
}

/*1. Take 10 integer inputs from user and store them in an array and print them on screen.*/
import java.util.Scanner;
public class PrintNumber
{
	public static void main(String[] args) {
	     int[] arr=new int[10];
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter 10 values : ");
	     for(int i=0;i<arr.length;i++){
	         arr[i]=sc.nextInt();
	     }
	     for(int n:arr)System.out.println(n);
	}
}

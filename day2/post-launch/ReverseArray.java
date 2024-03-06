/* 4. Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order.*/
import java.util.Scanner;
public class ReverseArray
{
	public static void main(String[] args) {
	     int[] arr=new int[10];
	     int[] newArray=new int[10];
	     Scanner sc=new Scanner(System.in);
	      System.out.println("Enter 10 number : ");
	     for(int i=0;i<arr.length;i++){
	         arr[i]=sc.nextInt();
	     }
	     for(int i=0;i<arr.length;i++){
	         newArray[arr.length-1-i]=arr[i];
	     }
	     for(int num:newArray)System.out.println(num);
	     
	}
}

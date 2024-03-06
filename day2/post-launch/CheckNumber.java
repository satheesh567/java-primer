/* 2. Take 10 integer inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether that number is present in array or not.*/
import java.util.Scanner;
public class CheckNumber
{
	public static void main(String[] args) {
	     int[] arr=new int[10];
	     Scanner sc=new Scanner(System.in);
	      System.out.println("Enter 10 number : ");
	     for(int i=0;i<arr.length;i++){
	         arr[i]=sc.nextInt();
	     }
	     System.out.println("Enter a number : ");
	     int checkNum=sc.nextInt();
	     boolean present=false;
	     for(int n:arr){
	     if(n==checkNum){
	         present=true;
	         break;
	     }
	     }
	     if(present)
	         System.out.println("the given number is present in array");
	     else 
	         System.out.println("the given number not  present in array");
	}
}

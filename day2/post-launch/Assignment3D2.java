 
/*3. Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.*/
import java.util.Scanner;
public class Assignment3D2
{
	public static void main(String[] args) {
	     int positive=0;
	     int negative=0;
	     int odd=0;
	     int even=0;
	     int zeros=0;
	     Scanner sc=new Scanner(System.in);
	      System.out.println("Enter 20 number : ");
	     for(int i=0;i<20;i++){
	         int num=sc.nextInt();
	         if(num>0)positive++;
	         else if(num<0)negative++;
	         if(num==0)zeros++;
	         else if(num%2==0)even++;
	         else odd++;
	     }
	    
	     System.out.println("number of positive numbers : "+positive);
	     System.out.println("number of negative numbers : "+negative);
	     System.out.println("number of odd numbers : "+odd);
	     System.out.println("number of even numbers : "+even);
	     System.out.println("number of zeros : "+zeros);
	}
}

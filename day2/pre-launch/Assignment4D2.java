/*4. Take 10 integers from keyboard using loop and print their average value on the screen.*/
import java.util.Scanner;
public class Assignment4D2
{
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
          System.out.println("Enter the 10 values : ");
          int sum=0;
          for(int i=0;i<10;i++){
              sum=sum+sc.nextInt();
          }
          System.out.println("average : "+((float)sum/10));
          
	}
}
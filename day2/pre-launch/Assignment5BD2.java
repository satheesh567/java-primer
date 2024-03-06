import java.util.Scanner;
public class Assignment5BD2
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number : ");
	     int num=sc.nextInt();
	     for(int i=0;i<num;i++){
	         for(int j=0;j<i;j++){
	         System.out.print(" ");
	         }
	         
	         for(int j=1;j<=2*(num-i)-1;j++){
	             if(j%2!=0)System.out.print("1");
	             else
	             System.out.print("0");
	         }
	         System.out.println();
	     }

	}
}

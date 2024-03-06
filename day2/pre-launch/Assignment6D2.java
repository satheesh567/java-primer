/*6. Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ). Print average and product of all numbers.*/
import java.util.Scanner;
public class Assignment6D2
{
	public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
    int sum=0;
    int prod=1;
    int count=0;
     while(true){
     System.out.println("enter the value : ");
     int num=sc.nextInt();
      sum=sum+num;
      prod=prod*num;
      count++;
      System.out.println("press 'q' or 'c'");
      char res=sc.next().charAt(0);
      if(res=='q')break;
    }
    System.out.println("average of all numbers : "+(sum/count));
    System.out.println("product of all numbers : "+prod);
          
 }
}


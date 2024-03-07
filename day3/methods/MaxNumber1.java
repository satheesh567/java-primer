import java.uti.Scanner;
public class MaxNumber1{
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers : ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("the greate number is : "+max(a,b));
}
  public static  int max(int a,int b) {
  return a>b?a:b;
  }
}
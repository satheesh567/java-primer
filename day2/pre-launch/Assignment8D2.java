/*8. A three digit number is called Armstrong number if sum of cube of its digit is equal to number itself.
E.g.- 153 is an Armstrong number because (13)+(53)+(33) = 153.
Write all Armstrong numbers between 100 to 500.*/
import java.util.Scanner;
class Assignment8D2{
   public static void main(String[] args){
    System.out.println("Enter a number : ");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int temp=num;
    int res=0;
    while(num>0){
     int rem=num%10;
       res=res+(int)Math.pow(rem,3);
      num=num/10;
    }
    if(temp==res)System.out.println("given number is amstrong number");
    else System.out.println("not a amstrong number");
  }
}
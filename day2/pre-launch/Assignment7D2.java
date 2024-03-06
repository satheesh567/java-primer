/*7. Write a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers8*/
 import java.util.Scanner;
 class Assignment7D2{
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int m= Math.min(a, b);
       int res=1;
      for(int i=1;i<=m;i++){
        if(a%i==0&&b%i==0)res=i;
      }
    System.out.println(" greatest common divisor of "+a+" and "+b+" is : "+res);
}
}
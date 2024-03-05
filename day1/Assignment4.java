/*4. Input the marks of Robert in three subjects using Scanner (each out of 100 ), write a program to calculate his total marks and percentage marks.*/
import java.util.*;
class Assignment4{
  public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        System.out.println("enter subject 1 marks : ");
        int subject1=sc.nextInt();
        System.out.println("enter subject 2 marks : ");
        int subject2=sc.nextInt();
        System.out.println("enter subject 3 marks : ");
        int subject3=sc.nextInt();
        int totalMarks = subject1+ subject2+ subject3;
       double percentageMarks = (totalMarks / 300.0) * 100.0;
        System.out.println("Total marks of Robert: " + totalMarks);
        System.out.println("Percentage marks of Robert: " + percentageMarks + "%");
 }
}
/*3. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
*/
 import java.util.Scanner;
class Assignment3D2{
 public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
         boolean permit=true;
     System.out.println("Enter the number of classes held : ");
     int classesHeld=sc.nextInt();
     System.out.println("Enter the number of classes attended : ");
     int classesPresent=sc.nextInt();
     int percentage=(int) (((float) classesPresent/classesHeld) * 100);
     if(percentage<75){
          System.out.println("he/her has medical cause Enter (Y or N) : ");
          char medicalCause=sc.next().charAt(0);
          if(medicalCause=='Y')permit=true;
          else permit=false;
     }
     if(permit)
     System.out.println("allowed");
     else
      System.out.println("not allowed");
      
 }
}
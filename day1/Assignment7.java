/*The total number of students in a class are 90 out of which 45 are boys. If 50% of the total students secured grade 'A' out of which 20 are boys, then write a program to calculate the total number of girls getting grade 'A'.*/
 
class Assignment7{
 public static void main(String[] args){
   int totalStudents=90;
   int boys=45;
   int girls=totalStudents-boys;
   int boysGradeA = 20;
   int AGradeStudents=((totalStudents*50)/100);
   System.out.println("boys with A grade : "+boysGradeA);
   System.out.println("girls with A grade : "+(AGradeStudents-boysGradeA));
   
 }
}
import java.util.Scanner;
class Assignment5BD2{
 public static void main(String[] args){
    
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter value : ");
         int rows=sc.nextInt();
        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

           
            for (int k = 0; k < rows - i; k++) {
                if (k % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }

            System.out.println(); 
        }
    }
 
}

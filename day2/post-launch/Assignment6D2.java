/*6. Initialize and print all elements of a 2D array.*/
import java.util.Scanner;
public class Assignment6D2
{
	public static void main(String[] args) {
	     int[][] arr=new int[3][3];

	     Scanner sc=new Scanner(System.in);
	     for(int i=0;i<arr.length;i++){
	           for(int j=0;j<arr.length;j++){
	               arr[i][j]=sc.nextInt();
	           }
	     }
	     for(int i=0;i<arr.length;i++){
	        for(int j=0;j<arr.length;j++){
	            System.out.print(arr[i][j]+" ");
	        }
	        System.out.println();
	     }
	   
	   
	     
	}
}

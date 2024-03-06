/*7. Find largest and smallest elements of an array.*/
import java.util.Scanner;
public class Assignment7D2
{
	public static void main(String[] args) {
	     int[] arr=new int[10];
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter 10 elements : ");
	     for(int i=0;i<arr.length;i++){
	               arr[i]=sc.nextInt();
	     }
	     int smallest=arr[0];
	     int largest=arr[0];
	     for(int i=1;i<arr.length;i++){
	         if(arr[i]>largest)largest=arr[i];
	         if(arr[i]<smallest)smallest=arr[i];
	     }
	     System.out.println(largest+" "+smallest);
	}
}

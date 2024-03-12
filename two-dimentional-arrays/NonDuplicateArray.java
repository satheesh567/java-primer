import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Integer> set=new HashSet<>();
        System.out.println("enter number of rows : ");
        int rows=sc.nextInt();
        System.out.println("enter number of cols : ");
        int cols=sc.nextInt();
        int[][] arr=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("enter value at pos "+(i)+","+(j)+ " : ");
                while (true) {

                    int newValue = sc.nextInt();
                    if (set.contains(newValue)) {
                        System.out.println("enter value again");
                    } else {
                        set.add(newValue);
                        arr[i][j] = newValue;
                        break;
                    }
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

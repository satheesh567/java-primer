/*8. Consider an integer array, the number of elements in which is determined by the user. The elements are also taken as input from the user. Write a program to find those pair of elements that has the maximum and minimum difference among all element pairs.
HINT : 
maximum difference = higest-lowest
minimum difference = second lowest - lowest*/
import java.util.Scanner;
import java.util.Arrays;
public class MaxMinDifference{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int maxDiff = arr[n - 1] - arr[0];

        int minDiff = arr[1] - arr[0];

        for (int i = 2; i < n; i++) {
            if (arr[i] - arr[i - 1] < minDiff) {
                minDiff = arr[i] - arr[i - 1];
            }
        }
        System.out.println("Pair with maximum difference: " + arr[0] + " and " + arr[n - 1]);
        System.out.println("Pair with minimum difference: " + (arr[0] + minDiff) + " and " + arr[0]);
    }
}

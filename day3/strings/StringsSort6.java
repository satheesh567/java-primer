/*6. Write down the names of 10 of your friends in an array and then sort those in alphabetically ascending order.(HINT : USE the compareTo methid of String)*/
import java.util.Arrays;
import java.util.Scanner;

public class StringsSort6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of friends: ");
        int len = scanner.nextInt();
        scanner.nextLine(); 
        
        String[] friendNames = new String[len];
       
        System.out.println("Enter the names of " + len + " friends:");
        for (int i = 0; i < numberOfFriends; i++) {
            System.out.print("Friend " + (i + 1) + ": ");
            friendNames[i] = scanner.nextLine();
        }

        Arrays.sort(friendNames);
        System.out.println("Sorted names:");
        for (String name : friendNames) {
            System.out.println(name);
        }

    }
}

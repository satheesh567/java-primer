/*5. Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.*/
import java.util.Scanner;

class Average {
    public int average(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }
}

public class AverageCalulator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        Average avg = new Average();

        int result = avg.average(num1, num2, num3);
        System.out.println("Average of the three numbers: " + result);
    }
}

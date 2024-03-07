import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your gross salary: ");
        double grossSalary = scanner.nextDouble();

        System.out.print("Enter your total savings: ");
        double totalSavings = scanner.nextDouble();

        double tax = taxCalculator(grossSalary, totalSavings);

        System.out.println("Tax: " + tax);

        scanner.close();
    }

    private static double taxCalculator(double grossSalary, double totalSavings) {
        double taxableIncome = Math.max(grossSalary - 100000, 0);

        double tax = 0;
        if (taxableIncome > 500000) {
            tax += (50000 * 0) + (100000 * 0.1) + (300000 * 0.2) + ((taxableIncome - 500000) * 0.3);
        } else if (taxableIncome > 200000) {
            tax += (50000 * 0) + (100000 * 0.1) + ((taxableIncome - 200000) * 0.2);
        } else if (taxableIncome > 100000) {
            tax += (50000 * 0) + ((taxableIncome - 100000) * 0.1);
        }

        return tax;
    }
}

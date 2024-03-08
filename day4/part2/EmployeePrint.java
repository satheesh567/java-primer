import java.util.Scanner;

class Employee {
    private String name;
    private int salary;
    private String dateOfJoining;

    public Employee(String name, int salary, String dateOfJoining) {
        this.name = name;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nSalary: " + salary + "\nDate of Joining: " + dateOfJoining + "\n";
    }
}

public class EmployeePrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: \u20B9");
            int salary = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Date of Joining (YYYY-MM-DD): ");
            String dateOfJoining = scanner.nextLine();
            employees[i] = new Employee(name, salary, dateOfJoining);
        }

        System.out.println("\nEmployee Details:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}

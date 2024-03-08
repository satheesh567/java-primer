/*7. Write a program by creating an 'Employee' class having the following methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours*/

import java.util.Scanner;

class Employee {
    private int salary;
    private int hoursOfWorkPerDay;

    public Employee(int salary, int hoursOfWorkPerDay) {
        this.salary = salary;
        this.hoursOfWorkPerDay = hoursOfWorkPerDay;
    }

    public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    public void addWork() {
        if (hoursOfWorkPerDay > 6) {
            salary += 5;
        }
    }

    public void getInfo() {
        System.out.println("Original Salary: $" + salary);
        addSal();
        addWork();
        System.out.println("Final Salary: $" + salary);
    }
}

public class EmplyeeSalaryCalcuLator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter salary of the employee: ");
        int salary = scanner.nextInt();
        System.out.print("Enter number of hours of work per day: ");
        int hoursOfWorkPerDay = scanner.nextInt();

        Employee employee = new Employee(salary, hoursOfWorkPerDay);
        employee.getInfo();

        scanner.close();
    }
}

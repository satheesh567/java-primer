/*. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreet
Sam                2000                68D- WallsStreet
John                1999                26B- WallsStreet*/
class Employee {
    private String name;
    private int yearOfJoining;
    private double salary;
    private String address;

    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-20d %-20s", name, yearOfJoining, address);
    }
}

public class EmployeeManager{
    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert", 1994, 50000, "64C- WallsStreet");
        Employee employee2 = new Employee("Sam", 2000, 60000, "68D- WallsStreet");
        Employee employee3 = new Employee("John", 1999, 55000, "26B- WallsStreet");

        System.out.println("Name        Year of joining        Address");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}

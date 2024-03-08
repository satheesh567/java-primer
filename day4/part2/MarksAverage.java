/*2. Write a program to print the roll number and average marks of 8 students in three subjects (each out of 100). The marks are entered by user.*/
import java.util.Scanner;
class Student {
    private int rollNumber;
    private int[] marks = new int[3];

    public Student(int rollNumber, int[] marks) {
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public double calculateAverage() {
        double sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Average Marks: " + calculateAverage());
        System.out.println();
    }
}

public class MarksAverage{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            System.out.print("Enter roll number: ");
            int rollNumber = scanner.nextInt();
            int[] marks = new int[3];
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for Subject " + (j + 1) + ": ");
                marks[j] = scanner.nextInt();
            }
            students[i] = new Student(rollNumber, marks);
        }

        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.displayDetails();
        }
    }
}

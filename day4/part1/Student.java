class Student {
    private String name;
    private int roll_no;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return roll_no;
    }
}

public class StudentManager {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("John");
        student1.setRollNo(2);

        Student student2 = new Student();
        student2.setName("Sam");
        student2.setRollNo(3);

        System.out.println("Details of Student 1:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Roll No: " + student1.getRollNo());

        System.out.println("\nDetails of Student 2:");
        System.out.println("Name: " + student2.getName());
        System.out.println("Roll No: " + student2.getRollNo());
    }
}

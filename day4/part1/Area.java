/*1. Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.*/
import java.util.Scanner;

class Area {
    private int length;
    private int breadth;

    public void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea() {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Area rectangle = new Area();

        System.out.print("Enter length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter breadth of the rectangle: ");
        int breadth = scanner.nextInt();

        rectangle.setDim(length, breadth);

        int area = rectangle.getArea();
        System.out.println("Area of the rectangle: " + area);
    }
}

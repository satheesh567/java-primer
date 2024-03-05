/*1. Write a program to calculate the area and perimeter of the rectangle. Input Length and breadth using command line arguments.*/

class Assignment1{

   public static void main(String[] args){
        int length=Integer.parseInt(args[0]);
        int width=Integer.parseInt(args[1]);
       System.out.println("area of trianle is : "+(length*width));
       System.out.println("perimeter of triangle is : "+(2*(length+width)));
   }
}
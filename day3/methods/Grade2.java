//2. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail
package com.sat.revature;
import java.util.Scanner;

public class Grade2 {
    public static void main(String[] args) {
		System.out.println("Enter the marks : ");
		Scanner sc=new Scanner(System.in);
		display(sc.nextInt());
	}
    public static void display(int marks) {
    	String grade="";
    	if(marks>=91&&marks<=100) {
    		grade="AA";
    	}
    	else if(marks>=81&&marks<=90) {
    		grade="AB";
    	}
    	else if(marks>=71&&marks<=80) {
    		grade="BB";
    	}
    	else if(marks>=61&&marks<=70) {
    		grade="BC";
    	}
    	else if(marks>=51&&marks<=60) {
    		grade="CD";
    	}
    	else if(marks>=41&&marks<=50) {
    		grade="DD";
    	}
    	else {
    		grade="Fail";
    	}
      System.out.println("Grade : "+grade);
    }
}

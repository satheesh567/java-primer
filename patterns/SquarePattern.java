package com.revature.pyramids;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length : ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){

            for(int j=1;j<=num;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

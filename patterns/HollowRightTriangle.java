package com.revature.pyramids;

import java.util.Scanner;

public class HollowRightTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length : ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){

            for(int j=1;j<=i;j++){
                if(i==1||j==1||j==i||i==num)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

package com.revature.squre;

import java.util.Scanner;

public class HollowSquarePattern4 {
    public static void main(String[] args) {
        System.out.println("Enter length of square : ");
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        System.out.println("enter how many cols of sqs : ");
        int ros=sc.nextInt();
        for(int i=1;i<=len*ros;i++){
            if(i%len!=1||i==1) {
                for (int j = 1; j <= len; j++) {
                    if ((i == 1 || i == len || j == 1 || j == len || i % len == 0)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}

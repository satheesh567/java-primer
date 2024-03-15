package com.revature.squre;

import java.util.Scanner;

public class HolloSquarePattern3 {
    public static void main(String[] args) {
        System.out.println("Enter length of square : ");
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        System.out.println("enter how many rows of sqs : ");
        int ros=sc.nextInt();
        for(int i=1;i<=len;i++){
            for(int j=1;j<=len*ros;j++) {
                if(j%len!=1||j==1)
                if((i==1||i==len||j==1||j==(len*ros)||j%len==0)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

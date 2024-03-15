package com.revature.squre;

import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        System.out.println("enter the length : ");
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        for(int i=1;i<=len;i++){
            for(int j=1;j<=len;j++){
                if(i==1||i==len||j==1||j==len){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}

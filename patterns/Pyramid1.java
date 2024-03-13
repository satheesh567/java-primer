package com.revature.pyramids;

import java.util.Scanner;

public class Pyramid1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a length of pyramid : ");
        int len=sc.nextInt();
        for(int i=0;i<len;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

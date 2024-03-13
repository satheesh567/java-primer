package com.revature.pyramids;

import java.util.Scanner;

public class Pyramid10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length : ");
        int len=sc.nextInt();
        for(int i=1;i<=len;i++){
            for(int j=1;j<=(len-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                if(j==1||j==(2*i-1)||i==len)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}

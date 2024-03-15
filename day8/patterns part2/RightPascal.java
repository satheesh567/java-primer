package com.revature.pattens2;

import java.util.Scanner;

public class RightPascal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length : ");
        int n=sc.nextInt();
        int n1=n/2;
        int n2=n-n1;
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1;i<=n2;i++){
            for (int j=i;j<=n2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

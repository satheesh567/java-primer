package com.revature.lamda;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc=(num1,num2,oper)->{
            switch (oper) {
                case "+":
                    return num1 + num2;
                case "*":
                    return num1 * num2;
                case "-":
                    return num1 - num2;
                case "/":
                    return num1 / num1;
                default:
                    return 0;
            }
        };
        int n=calc.claculate(2,3,"+");
        System.out.println(n);
    }
}

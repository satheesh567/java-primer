/*Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.*/

class Assignment3{
    public static void main(String[] args){
        int number = 2345;
        number += 8;
        int quotient = number / 3;
        int remainder = quotient % 5;
        int result = remainder * 5;
        System.out.println("Final result: " + result);
    }
}
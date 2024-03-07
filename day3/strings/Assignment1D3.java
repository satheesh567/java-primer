/*1. Write a program to check if the letter 'e' is present in the word 'Umbrella'.*/
class Assignment1D1{
  public static void main(String[] args){
     String s="Umbrella";
     boolean present=false;
     for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='e'){
          present=true;
         }
     }
     if(present)System.out.println("e is present in umbrella");
     else 
       System.out.println("e is not present in umbrella");
  }
}
/*3. Print the multiplication table of 15 using recursion.*/
public class RecursionTable3 {
  public static void main(String[] args) {
	  table(15,1,10);
  }

  public static void table(int name,int start,int end) {
	  if(start>end) return;
	   System.out.println(name+"*"+start+"="+(start*name));
	  table(name,start+1,end);
  }
}
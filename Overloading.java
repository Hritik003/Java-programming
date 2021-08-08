import java.util.Scanner;
class  addition{
	   //Using Constructors//
	   public addition(double i,double j)
	   {
		   
		  System.out.println( i+j );
	   }
	   
	   
	   //using methods//
	   
	   public void add(double i,double j) {
		   System.out.println(i+j);
	   }
	   
	   
	   
}
public class Overloading {
               public static void main(String[] args) {
            	   addition obj = new addition(2.8,5.2);
				Scanner input = new Scanner(System.in);
				double n1 = input.nextFloat();
				double n2 = input.nextFloat();
				input.close();
				
				obj.add(n1,n2);
				
				
				} 
}

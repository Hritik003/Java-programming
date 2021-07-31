import java.util.Scanner;
import java.math.*;

class fact{
	public void fact1(int n) {
	         
	         if(n==1)
	         {
	        	 System.out.println("1");
	        	 
	         }
	         while(n !=1)
	         {
	        	 System.out.print( n * fact1(n-1));
	        	
	         }
	}
	  

public class objectdemo {
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		int n = 5;
		
		obj fact = new fact();
		
		
	}

}

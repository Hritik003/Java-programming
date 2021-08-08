<<<<<<< HEAD
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
||||||| 7260561
=======
import java.util.Scanner;
class Casio{
	   //Using Constructors//
	   public Casio(double i,double j,double k)
	   {
		  System.out.println(i+j+k);
	   }
	   
	   
	   //using methods//
	   
	   public void add(double i,double j) {
		   System.out.println(i+j);
	   }
	   
	   
	   
}
public class Overloading {
               public static void main(String[] args) {
				Casio obj = new Casio();
				Scanner input = new Scanner(System.in);
				double n1 = input.nextFloat();
				double n2 = input.nextFloat();
				double n3 = input.nextFloat();
				if(n3==0)
				{
				obj.add(n1,n2);
				}
				else 
				{
					obj.add(n1,n2,n3);
				}
				} 
}
>>>>>>> dffb81b4159e35df5962af9d6f4be4bc7703fd9a

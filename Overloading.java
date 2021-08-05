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

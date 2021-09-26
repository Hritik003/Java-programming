import java.util.Scanner;

 class Baseclass{
	
	int x=5;
	
	
	void msg()
	{
		System.out.println(" Baseclass Method");
	}
	
	
  
	
}
 class Baseclass2 extends Baseclass{
	 
	 
	 int y = 20;
	 
	 
	 void msg() {
		 System.out.println("Base class 2 first method ");
	 }
	 
	 void msg2() {
		 System.out.println("Base class 2 second method ");
	 }
 }


public class inheritancePrac2 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Baseclass Base = new Baseclass();
	Baseclass2 obj2 = new Baseclass2();
	System.out.println("Value of x :" + obj2.x);
	obj2.msg();
	obj2.msg2();
	
	System.out.println("valeu of x:" +  Base.x);
	Base.msg();

}
}

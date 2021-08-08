import java.util.Scanner;

class Factorial{
	
	int fact(int i)
	{
		int res;
		if(i==1) return 1;
		res = i*fact(i-1); return res;
	}
}
public class recursion
{
 public static void main(String[] args) {
	Factorial f = new Factorial();
	System.out.println("enter your number: ");
	Scanner in = new Scanner(System.in);
	
	int n = in.nextInt();	
	in.close();
	System.out.println("factorial of the number entered is " + f.fact(n));
}
}

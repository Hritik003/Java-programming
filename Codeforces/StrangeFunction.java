import java.util.Scanner;

public class StrangeFunction {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int t = s.nextInt();
	for(int i =0;i<t;i++)
	{
		int n = s.nextInt();
		
		for(int j=1;j<=n;j++)
		{
			 function(j);
		}
		
		
	}
	s.close();
}


private static int function(int m) {
	int ans;int result=0;
	for(int j=1;j<=m;j++)
	{
		if(j%2==0)
		{
			ans =3;
			
			
		}
		else
		{
			ans=2;
			
			
		}
	  result = result + ans;
	}
	return result;
	
}

}

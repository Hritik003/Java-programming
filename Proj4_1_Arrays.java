import java.util.Scanner;

public class Proj4_1_Arrays {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the array plox");
		n = input.nextInt();
		int[] fun = new int[n]; 
		for(int i =0;i<n;i++)
		{
			
			System.out.println("Enter your number:");
			fun[i]=input.nextInt();
			
		}
		
		for(int j=0;j<n;j++) {
		
			fun[j]= 2*fun[j];
			
		}
		
		for(int k =0;k<n;k++)
		{
		System.out.println("the numbers stored in the array are :" + fun[k] );
		}
		input.close();
		}

}

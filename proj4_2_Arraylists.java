import java.util.ArrayList;
import java.util.Scanner;

public class proj4_2_Arraylists {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    ArrayList<Double> mylist = new ArrayList<>();
	    double in;
	    System.out.println("enter 0 or more than 0 or -1 to exit:");
	    in = input.nextDouble();
	    while(in >=0)
	    {
	    	mylist.add(in);
	    	System.out.println("enter 0 or more than 0 or -1 to exit:");
	    	in = input.nextDouble();
	    	
	    }//end while
	    input.close();
	    for(int i= mylist.size()-1;i>=0;i--)
	    {
	    	System.out.println(mylist.get(i));
	    }
}//end main

}

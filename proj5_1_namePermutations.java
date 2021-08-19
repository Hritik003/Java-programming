import java.util.Scanner;
import java.util.ArrayList;
public class proj5_1_namePermutations {
 public static void main(String[] args) {
	 
	 ArrayList<String> firstnames = new ArrayList<>();
	 ArrayList<String> lastnames = new ArrayList<>();
	Scanner in = new Scanner(System.in);
	String fullname;
	String first;
	String last;
	int k;
	for(int i=1;i<=5;i++)
	{
		System.out.println("Enter the name:" + i +"\t");
		fullname= in.next();
		k =fullname.indexOf(" ");
		first = fullname.substring(0,k); //does not include k.
		last = fullname.substring(k+1); //"k+1" selects from k+1 to the end of the string since not specified.
		firstnames.add(first);
		//adding the firstnames into the arraylist of the firstname.
		
		lastnames.add(last);
		//adding the lastnames into the arraylist of the lastname.
		
	}//end for
	
	for( int i=0 ;i<firstnames.size();i++)
	{
		for (int j =0; j<lastnames.size() ;j++)
		{
			System.out.println(firstnames.get(i) + " ");
			System.out.println(lastnames.get(j));
			
		}//end for j
	}//end for i
	in.close();
	
}//end main
}

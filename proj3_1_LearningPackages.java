import java.util.Scanner;


public class proj3_1_LearningPackages {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int packagenumber;
	int courses;
	int basecost = 0;
	int costpercourse = 0;
	int numincluded = 0;
	int totalcost;
	System.out.println("which package are you intrested in? 1 , 2 or 3?");
	packagenumber = input.nextInt();
	System.out.println("how many courses did u enroll into?");
	courses = input.nextInt();
	input.close();
	
	
	if(packagenumber ==1)
	{
		basecost = 10;
		costpercourse =6;
		numincluded =2;
	}
	else if(packagenumber ==2) {
		basecost = 12;
		costpercourse =4;
		numincluded =4;
		
	}
	else if(packagenumber ==3) {
		basecost = 15;
		costpercourse =3;
		numincluded =6;
	}
	
	if(courses > numincluded)
	{
	 totalcost = (basecost + (courses - numincluded)*costpercourse);	
	}
	else
	{
		totalcost= basecost;
	}
	System.out.println("total cost of the package is $"+totalcost);
      
	//end main
	}
}

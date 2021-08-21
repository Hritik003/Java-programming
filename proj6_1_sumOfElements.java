import java.util.ArrayList;
public class proj6_1_sumOfElements {
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<>();
	list.add(13);
	list.add(43);
	list.add(56);
	
	int sum = sum(list);
	System.out.println("the sum of the elements are " + sum);
	
	
	}//end main

public static int sum(ArrayList<Integer> list) {
	int sum =0;
	for(int i=0;i<list.size();i++)
	{
		sum = sum + list.get(i);
	}//end for i
	return sum;
}//end method
}

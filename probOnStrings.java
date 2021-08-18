import java.util.Scanner;


public class probOnStrings {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String name = in.nextLine();
	String name2 = null;
	String name3 = null;
	int i = name.indexOf(" ");
	name2 = name.substring(i);
	name3 = name.substring(0, i);
	String upper = name3.toUpperCase();
	String lower = name2.toLowerCase();
	System.out.print(upper);
	System.out.println(lower);
    System.out.println("upper is " + upper + " lower is" + lower);
	in.close();
}//end main
}

<<<<<<< HEAD
import java.util.Scanner;

import javax.swing.Box;

class box {
	int length;
	int breadth;
	int height;
          void volume(){
        	  System.out.println(length * breadth *height);
          }
}

public class classandobj {
                   public static void main(String[] args) {
                	   box mybox = new box();
                	   System.out.println("enter the values : ");
                	   Scanner input = new Scanner(System.in);
                	   mybox.length  = input.nextInt();
                	   mybox.breadth = input.nextInt();
                	   mybox.height = input.nextInt();
                	   System.out.print("The volume of the box is ");
                	   mybox.volume();
                   }
 }
||||||| empty tree
=======
import java.util.Scanner;

import javax.swing.Box;

class box {
	int length;
	int breadth;
	int height;
          void volume(){
        	  System.out.println(length * breadth *height);
          }
}

public class classandobj {
                   public static void main(String[] args) {
                	   box mybox = new box();
                	   System.out.println("enter the values : ");
                	   Scanner input = new Scanner(System.in);
                	   mybox.length  = input.nextInt();
                	   mybox.breadth = input.nextInt();
                	   mybox.height = input.nextInt();
                	   System.out.print("The volume of the box is ");
                	   mybox.volume();
                   }
 }
>>>>>>> 72605618c34cf817900fae98366e3f4472be0cb3

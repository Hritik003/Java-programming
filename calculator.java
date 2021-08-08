import java.util.Scanner;

public class main{
     public static void main(String[] args) {
          System.out.print("enter num1 op num2:");
          try(Scanner s = new Scanner(System.in)){
          double num1 = s.nextDouble();
          char o = s.next().charAt(0);
          double num2 = s.nextDouble();
                         }
        if(o == '+')
         {
          System.out.println(num1 + num2);

         }
         if(o == '-')
         {
           System.out.println(num1 - num2);
          }
         if(o == '*')
         {
          System.out.println(num1 * num2);

            }
         if(o == '/')
          {
           System.out.println(num1 / num2);
         }

        
    }
}

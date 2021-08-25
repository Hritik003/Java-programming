
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        
      Scanner sc=new Scanner(System.in);
        
        
        String A=sc.next();
        /*
         * logic 1 
         * 
        int l = A.length();
        int k = l/2;
        int m = (l+1)/2;
       
    if( l%2==0)  
    {
        if(A.substring(0,(k+1)).equals(A.substring((k+1),l+1)))
        {
        System.out.println("yes");
    }  
    else
        {
           System.out.println("No");
        }
        
    }
    else
    {
        if(A.substring(0,m).equals(A.substring((m+1), l+1 )))
        {
             System.out.println("Yes");
        }
        else
        {
           System.out.println("No");
        }
    }
    sc.close();*/
    	//logic 2 
        
        int i=0,j=A.length()-1;
        while(A.charAt(i)==A.charAt(j) && (i++)<=(j--));
        System.out.println(i>=j?"Yes":"No");
    }
}




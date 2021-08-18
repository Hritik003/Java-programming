import java.util.Scanner;

public class ProbOnSubstring {

    public static String getSmallestAndLargest(String s, int k) {
        String name = s.substring(0,k);
        String smallest = name;
        String largest = name;
      
    for(int i =1;i<=(s.length()-k);i++)
    {
        name = s.substring(i,(i+k));
        
        if(name.compareTo(smallest)<0){
            smallest = name;
        }
        if(name.compareTo(largest)>0){
            largest = name;
        }
    }
    
    return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

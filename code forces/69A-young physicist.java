import java.util.Scanner;
class youngphysicist{
    public static void main(String[] args) {
        int n,xsum=0,ysum=0,zsum=0;
        try(Scanner input = new Scanner(System.in)){
        n=input.nextInt();
        if(n>0)
        {
           int x=input.nextInt();
           int y=input.nextInt();
           int z=input.nextInt();
            xsum= xsum + x;
            ysum= ysum + y;
            zsum= z + zsum;
        }}
        if(xsum==0 && ysum==0 && zsum==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
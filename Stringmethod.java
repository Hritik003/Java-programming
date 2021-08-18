import java.util.Scanner;
import java.time.LocalDate;

public class Stringmethod {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int dd = in.nextInt();
	int mm = in.nextInt();
	int yyyy = in.nextInt();
	in.close();
	LocalDate dt = LocalDate.of(dd, mm, yyyy);
	System.out.println(dt.getDayOfWeek());
	
	}
}

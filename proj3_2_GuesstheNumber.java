import java.util.Scanner;
import java.util.Random;

public class proj3_2_GuesstheNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int guessnum;
		int count =0;
		int compNUM;
		Random random = new Random();
		compNUM = random.nextInt(100)+1;
		boolean Guess = false;
		
		while(!Guess)
		{
			System.out.println("Enter your integer guess :");
			guessnum = input.nextInt();
			if(guessnum>=1 && guessnum<=100)
			{
			
			if(guessnum > compNUM)
			{
				System.out.println("too high");
				count++;
			}
			else if(guessnum < compNUM)
			{
				System.out.println("too low");
				count++;
			}
	     	}
			else
			{
				System.out.println("You have wasted a guess. You must pick between 1 and 100 inclusive ");
				count++;
			}
			if(guessnum == compNUM)
			{
				Guess = true;
				count++;
				break;
				
				
			}
			
		}
		
		input.close();
		System.out.println("Congratulations! You have guessed the number right after " + count +" guesses. Thanks for Playing!");
		
		
	}
}

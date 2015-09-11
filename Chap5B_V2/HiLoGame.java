import java.util.Scanner;
import java.util.Random;

public class HiLoGame {

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		Random generator = new Random ();

		final int max = 10;
		int num1, num2;
		int guessCount = 0;

		num1 = generator.nextInt(max) + 1;
		System.out.println("Guess a number between 1 and 10. \nEnter your guess (0 to quit): ");
		num2 = scan.nextInt();
		scan.nextLine();

		{
			while (num2 != 0)
			{
				if (num2 < num1)
				{
					System.out.println("You guess was too low. \nGuess again (0 to quit): ");
					num2 = scan.nextInt();
					scan.nextLine();
					guessCount++;}
				else if (num2 > num1)
				{
					System.out.println("Your guess was too high. \nGuess again (0 to quit): ");
					num2 = scan.nextInt();
					scan.nextLine();
					guessCount++;
				}
				else
				{
					System.out.println("Your guess was correct!");
					guessCount++;
					System.out.println("Number of guesses: " + guessCount);
					num2 = 0;
				}
			}
			
		}
	}
}


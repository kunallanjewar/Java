import java.util.Scanner;

public class ReadStrings 
{

	public static void main (String[] args) throws StringTooLongException
	{
		final int Max = 20;
		String inp = "";

		Scanner scan = new Scanner(System.in);	

		StringTooLongException LengthException = new StringTooLongException ("String has too many characters \n\nPlease try again:\n");

		System.out.println("Enter strings, enter DONE when finished: \n");

		do
		{
			try 
		{
			do
			{
				inp = scan.nextLine();
				System.out.println("");
				if (inp.length()>Max)
					throw LengthException;
				else
					System.out.println("You entered: " + inp + "\n");
			}	while (!inp.equals("DONE"));
		}
			catch (StringTooLongException error)
			{
				System.out.println(error.getMessage());
			}
		} while (!inp.equals("DONE"));
	}
}
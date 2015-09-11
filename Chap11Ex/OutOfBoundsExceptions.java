import java.util.Scanner;


public class OutOfBoundsExceptions 
{
	public static void main(String[] args) 
	{
		String[] myArray = new String[] {"Java 1", "Java 2","VB","C#","JavaScript"};

		try
		{
			System.out.print("Enter a number, and I will display a course: ");
			Scanner scan = new Scanner(System.in);
			int i = scan.nextInt();
			System.out.println("Course is: " + myArray[i-1]);
		}
		catch (ArrayIndexOutOfBoundsException exception)
		{

			System.out.println("OOPSS!!! Script out of range.");
		}

	}
}
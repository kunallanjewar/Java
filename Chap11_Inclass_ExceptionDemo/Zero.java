
public class Zero 
{

	public static void main(String[] args) 
	{
		int numerator = 10;
		int denominator = 0;
		try
		{
			System.out.println(numerator/denominator);
		}
		catch (ArithmeticException exception)
		{
			System.out.println("Can not divide by zero.");
		}
	}
}

//This is an independent program
import java.util.Scanner;


public class SumEvens 
{

	public static void main(String[] args) 
	{
		int value, sum = 0,initial;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please input an integer value >= 2: ");
		value = scan.nextInt();

		if (value <2)
		{
			System.out.println("Error: Input value >=2:");
		}
		else
		{ 
			for (initial = 2; initial <=value; initial+=2)
			{
				sum +=initial;
			}
			System.out.println("Sum is: "+ sum);
		}

	}

}

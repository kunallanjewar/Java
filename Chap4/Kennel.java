import java.util.Scanner;

public class Kennel
{
	public static void main (String[] args)
	{
		int dAge;
		String dName;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);

		System.out.println ( "Enter Name of the Dog: ");
		dName = scan.nextLine();

		System.out.println ("Enter the age of the Dog:  " );
		dAge= scan.nextInt();


		Dog dog = new Dog(dName, dAge);
		System.out.println (dog);


	}
} 


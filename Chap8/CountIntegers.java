import java.util.Scanner;

public class CountIntegers {
	public static void main (String [] args)
	{
		int [] times = new int [51];
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);

		System.out.println ("Enter integers in the range 0-50.");
		System.out.println ("Signal end of list with a number outside the range.");

		int number = scan.nextInt ();
		System.out.println("");
		while (number >= 0 && number <= 50)
		{
			times [number] ++;
			number = scan.nextInt ();
			System.out.println("");

		}

		System.out.println ("Number\tTimes\n");
		for (int check = 0; check <= 50; check++)
			if (times [check] >= 1)
				System.out.println (check + "\t" + times [check]+"\n");
	}
}

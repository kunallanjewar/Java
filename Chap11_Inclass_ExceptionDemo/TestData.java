import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

//This is an independent program

public class TestData {

	public static void main(String[] args) throws IOException 
	{
		final int MAX = 10;

		int value;
		String fileName = "test.txt";

		PrintWriter outfile = new PrintWriter(fileName);

		Random rand = new Random();

		for (int line=1; line<=MAX; line++)
		{
			for (int num=1; num<=MAX; num++)
			{
				value = rand.nextInt(90) + 10;
				outfile.print(value + " ");
			}
			outfile.println();
		}
		outfile.close();
		System.out.println("Output file has been created: " + fileName);

	}

}

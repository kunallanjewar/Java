/*Kunal Lanjewar
  @01517667
  Assignment:
  PP 6.2 pg 296
  Java-1
 */

import java.util.Scanner;

public class StringDown 
{
	public static void main(String[] args) 
	{
		String name;
		int cursor = 0,length;
		char current;

		//to get input from user
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Please Enter Your Name: ");
		name = scan.nextLine();

		//count the length of the Name
		length = name.length();

		//Iterate and print char on each line
		for (int count = 0; count < length; count++)
		{
			current = name.charAt(cursor);
			System.out.println(current);
			cursor++;
		}
	}
}

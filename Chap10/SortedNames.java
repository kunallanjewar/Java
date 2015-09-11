import java.util.Scanner;


public class SortedNames 
{
	public static void main(String[] args) {

		//Declare Variables

		String name1;
		String name2;
		String name3;

		//Accept User Input

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter three names:");
		System.out.print("");

		name1= scan.nextLine();
		name2= scan.nextLine();
		name3= scan.nextLine();

		String[] list = {name1,name2,name3};

		int min;
		String temp;
		for (int index = 0; index < list.length-1; index++)
		{			min = index;

		for (int scan1 = index+1; scan1 < list.length; scan1++)
			if (list[scan1].compareTo(list[min])<0)
				min = scan1;

		// Swap the values

		temp = list[min];
		list[min] = list[index];
		list[index] = temp;
		}

		System.out.println("");


		System.out.println("Ordered list of names:");

		for (int index =0; index<list.length; index++)
		{

			System.out.print(list[index]+"\t");
		}



	}     

}

public class IntArray 
{

	public static void main(String[] args) 
	{

		int myArray[]={10,15,23,29,31,34,38,45};

		for(int counter =0;counter<myArray.length;counter++)
		{
			System.out.print(" "+myArray[counter]);
		}

		System.out.println("");

		for(int counter=myArray.length - 1; counter >= 0;counter--)
		{            
			System.out.print(" "+myArray[counter]);
		}
	}
}


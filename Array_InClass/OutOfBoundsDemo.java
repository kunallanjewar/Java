
public class OutOfBoundsDemo 
{

	public static void main(String[] args) {

		final int LIMIT = 15, MULTIPLE = 10;

		int [] myList = new int [LIMIT];
		System.out.println("Number of elements in myList: "+ myList.length);

		for (int index =0; index <LIMIT;index++)
		{System.out.println("Index "+index);
		myList[index]=index*MULTIPLE;
		}
		for (int value:myList)
			System.out.println(value + "");
	}

}

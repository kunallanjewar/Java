public class FunMath {

	public static void main(String[] Args)
	{
		int[] myArray = {7,1,8,4,10};
		int min;
		int temp;
		int median;
		double mean;

		for (int index = 0; index < myArray.length-1; index++)
		{			min = index;

		for (int scan = index+1; scan < myArray.length; scan++)
			if (myArray[scan] < (myArray[min]))
				min = scan;

		// Swap the values

		temp = myArray[min];
		myArray[min] = myArray[index];
		myArray[index] = temp;
		}

		System.out.print("Ordered list: ");

		for(int i=0; i < myArray.length; i++)
		{
			System.out.print(myArray [i]+ " ");
		}

		//Calculate Median
		
		if (myArray.length % 2 == 0)
			median = ((int)myArray[myArray.length/2] + (int)myArray[myArray.length/2 - 1])/2;
		else
			median = (int) myArray[myArray.length/2];

		int sum = 0;

		// Sum all values in our array
		
		for (int i=0; i<myArray.length; i++)
		{
			sum = sum + myArray[i];
		}

		// Calculate Mean
		
		mean = ((double) sum) / ((double) myArray.length);

		System.out.println("");
		System.out.println("The mean is " + mean + " and the median is " + median);

	}

}

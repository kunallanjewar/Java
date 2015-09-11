public class Array {

	public static void main(String[] args) {
		int[] myList = { 1, 2, 3, 4, 5 };

		// Prints the first element of array.
		System.out.println("First element is: \n" + myList[0] + "\n");

		// Prints all the array elements after the first element
		System.out.print("All elements after the first element are: \n");
		for (int i = 1; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}

		// Prints sum of two array elements.
		System.out.println("\n\nThe sum of two elements is:\n" + myList[0] + myList[3]);
	}
}
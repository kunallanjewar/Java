import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HR1 {


	static int solveMeFirst(int a, int b) {
		int sum = 0;
		
		sum = a + b;
		return sum;

	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b;

		a = in.nextInt();

		b = in.nextInt();

		HR1 obj = new HR1();

		obj.solveMeFirst(a, b);

		System.out.println(obj.solveMeFirst(a, b));
	}
}
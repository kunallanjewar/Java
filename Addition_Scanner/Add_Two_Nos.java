import java.util.Scanner;

public class Add_Two_Nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int FirstNo;
		double SecondNo, Result;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		FirstNo = scan.nextInt();
		
		System.out.println("Enter Second Number");
		SecondNo = scan.nextDouble();
		
		Result = FirstNo + SecondNo;
		
		System.out.println("The Addition of two number you Entered is " + Result);

	}

}

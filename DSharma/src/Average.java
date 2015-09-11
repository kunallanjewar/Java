import java.util.Scanner;


class Average {
	
	public static void main(String[] args){
		
		int a,b,c;
		double average;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		a = sc.nextInt();
		
		System.out.println("Enter the value of b: ");
		b = sc.nextInt();
		
		System.out.print("Enter the value of c: ");
		c = sc.nextInt();
		
		average = (double) (a+b+c)/3;
		
		System.out.println("The avaerge of 3 nos is: " + average);
	}
}
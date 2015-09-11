import java.util.Scanner;


public class Book {
	
	public static void main(String[] args)
	{
		String title, author, publisher, copyrgt;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Book title: ");
		title = sc.nextLine();
		
		System.out.println("Enter the Author: ");
		author = sc.nextLine();
		
		System.out.println("Enter the publisher: ");
		publisher = sc.nextLine();
		
		System.out.println("Enter the copyright: ");
		copyrgt = sc.nextLine();
		
		Bk obj = new Bk(title, author, publisher,copyrgt);
		System.out.println(obj);
	}

}

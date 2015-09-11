import java.util.Scanner;;

public class Bookshelf 
{
	public static void main (String[] args)
	{
		String Title, Author, Publisher, Copyright;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);

		System.out.println ( "Enter Title of the Book: ");
		Title = scan.nextLine();

		System.out.println ( "Enter Author of the Book: ");
		Author = scan.nextLine();

		System.out.println ( "Enter Publisher of the Book: ");
		Publisher = scan.nextLine();

		System.out.println ( "Enter Copyright of the Book: ");
		Copyright = scan.nextLine();


		Book book = new Book(Title, Author, Publisher, Copyright);
		System.out.println (book);
	}
} 


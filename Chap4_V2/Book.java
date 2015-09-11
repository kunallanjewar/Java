
public class Book 
{
	private String bTitle, bAuthor, bPublisher, bCopyright;


	//Constructor
	public Book(String Title, String Author, String Publisher, String Copyright)
	{
		bTitle = Title;
		bAuthor = Author;
		bPublisher = Publisher;
		bCopyright = Copyright;
		return;
	}

	//Setter
	public void setTitle(String Title)
	{
		this.bTitle = Title;
	}

	public void setAuthor(String Author)
	{
		this.bAuthor = Author;
	}

	public void setPublisher(String Publisher)
	{
		this.bPublisher = Publisher;
	}
	public void setCopyright(String Copyright)
	{
		this.bPublisher = Copyright;
	}


	//Getter
	public String getTitle()
	{
		return bTitle;
	}
	public String getAuthor()
	{
		return bAuthor;
	}
	public String getPublisher()
	{
		return bPublisher;
	}
	public String getCopyright()
	{
		return bCopyright;
	}

	//toString Method
	public String toString()
	{
		String bDiscription = "\nFollowing is the multi-line discription of your book: \nBook Title: "+ bTitle + "\nBook Author: " + bAuthor + "\nBook Publisher: "+ bPublisher + "\nBook Copyright: " + bCopyright;
		return bDiscription;
	}
}

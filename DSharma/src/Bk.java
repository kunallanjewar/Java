
public class Bk {

	private String btitle, bauthor, bpublisher, bcopyrgt;
	//constructor
	public Bk (String title, String author, String publisher, String copyrgt)
	{
		btitle = title;
		bauthor = author;
		bpublisher = publisher;
		bcopyrgt = copyrgt;
	}
	
	//Setters
	
	public void settitle(String title){
		this.btitle = title;
	}
	
	public void setauthor(String author){
		this.bauthor = author;
	}
	
	public void setpublisher(String publisher){
		this.bpublisher = publisher;
	}
	
	public void setcopyrgt(String copyrgt){
		this.bcopyrgt = copyrgt;
	}
	
	//Getters
	public String gettitle()
	{
		return btitle;
	}
	
	public String getauthor()
	{
		return bauthor;
	}
	
	public String getpublisher()
	{
		return bpublisher;
	}
	
	public String getcopyrgt()
	{
		return bcopyrgt;
	}
	
	public String toString(){
		String desp = "Following is what you entered:\nBook Title: " + btitle+ "\nAuthor: " + bauthor+ "\nPublisher: " +bpublisher+ "\nCopyright: " +bcopyrgt;
		return desp;
	}
}


public class MonetoryCoin extends Coin
{
	int Value;

	public MonetoryCoin(int Value)
	{
		super.flip();
		this.Value=Value;
	}

	public int getValue()
	{
		return Value;
	}
	
	public String toString()
	{
		
		String result = super.toString() + " " + Value;

		return result;
	}

}


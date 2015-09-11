package trial;
public class Trial1 
{

	public static int main(String[] args) 
	{
		int[] arr = new int []{3,7,1,11,5};
		int i =0,j=arr.length - 1;

		{

			while (i<=j)
			{
				i++;
				if(i==j){
					return i;
				}
				j--;
				}
		}
		return j;			
	}
}
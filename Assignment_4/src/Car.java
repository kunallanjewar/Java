public class Car extends Makes
{
		private String year;
		private String color;
		private double price; 
		

		public Car (String year, String color,double price, String country, String manufacturer, String brandName) 
		{ 
			super (country, manufacturer, brandName);
			this.year = year; 
			this.color = color;
			this.price = price;
		} 

		//Setter
		public void setYear(String nYear)
		{
			year = nYear;
		}
		
		public void setColor(String nColor)
		{
			color = nColor;
		}
		
		public void setPrice(double nPrice)
		{
			price = nPrice;
		}
		
		public void setMakes(String nCountry, String nManufac, String nBrand)
		{
			super.setCountry(nCountry);
			super.setManufac(nManufac);
			super.setBrand(nBrand);
		}
		
		
		//Getter
		public String getYear( )
		{
			return year;
		}
		
		public String getColor( )
		
		{
			return color;
		}
		
		public double getPrice( )
		{
			return price;
		}
		
		public Makes getMakes( )
		{
			return getMakes();
		}
				 
		//toString Method
			public String toString()
			{
				String result = super.toString() + "\nYear:\t\t" + year + "\nColor:\t\t" + color + "\nPrice:\t\t" + price + "\n\n";
				return result;
			}
		
}
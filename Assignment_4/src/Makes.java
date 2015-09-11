public class Makes 
{
		private String country; 
		private String manufacturer; 
		private String brandName;

		public Makes (String country, String manufacturer, String brandName) 
		{ 
			this.manufacturer = manufacturer; 
			this.country = country;
			this.brandName = brandName;
		} 

		//Setter
		public void setCountry(String nCountry)
		{
			country = nCountry;
		}
		
		public void setManufac(String nManufac)
		{
			manufacturer = nManufac;
		}
		
		public void setBrand(String nBrand)
		{
			brandName = nBrand;
		}
		
		
		//Getter
		public String getCountry()
		{
			return country;
		}
		
		public String getManufac()
		{
			return manufacturer;
		}
		
		public String getBrand()
		{
			return brandName;
		}
		
		 
		//toString Method
			public String toString()
			{
				String Info = "\nCountry:\t" + country + "\nManufacturer:\t" + manufacturer + "\nBrand:\t\t" +brandName;
				return Info;
			}
		

}

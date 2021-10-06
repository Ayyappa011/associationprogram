class Currency
{
	String name;
	float value;
	
	Country cref = new Country();
	void displaydetails()
	{
		System.out.println (this.name);
		System.out.println(this.value);
	}
	
	public static void main(String[] kulli)
	{
		Currency currf = new Currency();
		currf.name="india";
		currf.value=15.23f;
		currf.displaydetails();
		
		currf.cref = new Country();
		currf.cref.name="AUS";
		currf.cref.code=+94;
		currf.cref.displaydetails();
		
	}
	
}
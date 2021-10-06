class Product
{
	String name;
	String type;
	float price;
	int quantity;
	Vendor venref = new Vendor(); 
	
	void displaydetails()
	{
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.quantity);
	
	}
	public static void main(String[] mad)
	{
		Product pref = new Product();
		pref.name="SAM";
		pref.type="plastic";
		pref.price=12999;
		pref.quantity=15;
		
		pref.displaydetails();
		
		pref.venref= new Vendor();
		pref.venref.name="mak";
		pref.venref.salary=78999;
		
		pref.venref.displaydetails();
	}
}
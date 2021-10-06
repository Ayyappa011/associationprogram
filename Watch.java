class Watch
{
	int totalno;
	float price;
	static String name;
	
	Watch(int totalno,float price)
	{
		this.totalno=totalno;
		this.price=price;
		
	}
	public static void main(String[] args)
	{
		Watch wref = new Watch(12,233.0f);
		System.out.println(wref.totalno);
		System.out.println(wref.price);
		String name="sonta";
		
		Watch wref1 = new Watch(11,23.0f);
		
		System.out.println(wref1.price);
		System.out.println(wref1.totalno);
		String name="maximum";
		System.out.println(wref1.name);
		
	}

	

}
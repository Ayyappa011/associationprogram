class NailCutter
{
	String company;
	String color;
	float price;
	String Dlocation;
	online onlineshopping;
	enum online
	{
		FLIPKART,MYNTRA,NYKA;
	}
	
	 void cuttingnails()
	{
		System.out.println("invoked cuttingfingernails");
		System.out.println("Nailcutter Details:");
		System.out.println(company);
		System.out.println(color);
		System.out.println(price);
		System.out.println(Dlocation);
		System.out.println(onlineshopping);
		
	}
	  void cuttinghangnails()
	{
		System.out.println("invoked cuttinghangernails");
		System.out.println("Nailcutter Details:");
		System.out.println(company);
		System.out.println(color);
		System.out.println(price);
		System.out.println(Dlocation);
		System.out.println(onlineshopping);
		
	}
	public static void main(String[] mad)
	{
		NailCutter nref = new NailCutter();
		nref.company="cuteably";
		nref.color="pink";
		nref.price=235.23f;
		nref.Dlocation="BTM";
		nref.onlineshopping=online.NYKA;
		System.out.println("____________________________________________");
		
		
		NailCutter nref22 = new NailCutter();
		nref22.company="bell orginal";
		nref22.color="gold";
		nref22.price=2355.23f;
		nref22.Dlocation="BTM 2nd stg";
		nref22.onlineshopping=online.MYNTRA;
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		
		NailCutter nref44 = new NailCutter();
		nref44.company="isweven";
		nref44.color="red";
		nref44.price=23.23f;
		nref44.Dlocation="BTM 4th stg";
		nref44.onlineshopping=online.FLIPKART;
		
		nref.cuttingnails();
		nref22.cuttingnails();
		nref44.cuttinghangnails();
		
		
		
	}
}
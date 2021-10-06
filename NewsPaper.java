class NewsPaper
{
	String name;
	String owenername;
	Lname language;
	enum Lname;
	{KANNADA,TELGU,HINDI}
	News papertype;
	enum News
	{
		DAILY,WEEKLY,MONTHLY
	}
	paperprice newspaper;
	enum paperprice{KANNADA(1F),TELGU(5F),HINDI(6F);
	
	float price;
	NewsPaper(float price)
	{
		this.price=price;
	}
	}
	String editor;
	
	NewsPaper(String name , String owenername,Lname language)
	{
		this.name=name;
		this.owenername=owenername;
		this.language=language;
		
	}
	public static void main(String[] mad)
	{
		System.out.println(Lame.TELGU)
		NewsPaper ref = paperprice.TELGU;
		System.out.println(paperprice.TELGU.price);
		
		System.out.println(papertype.DAILY);
		System.out.println();
		
	}
	
	
	
	
}
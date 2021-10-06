class Helmet
{
	String company;
	float price;
	String color;
	Typesofhelmet type;
	enum Typesofhelmet
	{
		F_F_HELMET,H_F_HELMET,OFF_R_HELMET;
	}
	String bikename;
	
	void avoidinjury()
	{
		System.out.println("invoked avoidinjury");
		System.out.println("Helmet details:");
		System.out.println(company);
		System.out.println(price);
		System.out.println(color);
		System.out.println(type);
		System.out.println(bikename);
		System.out.println("________________________");
	}
	void weatherprotection()
	{
		System.out.println("invoked weatherprotection");
		System.out.println("Helmet details:");
		System.out.println(company);
		System.out.println(price);
		System.out.println(color);
		System.out.println(type);
		System.out.println(bikename);
		System.out.println("+++++++++++++++++++++++++++++");
		
	}
	
	public static void main(String[] mak)
	{
		Helmet href = new Helmet();
		href.company="studds";
		href.price=700.5f;
		href.color="red";
		href.type=Typesofhelmet.F_F_HELMET;
		href.bikename="FZ";
		
		Helmet href1 = new Helmet();
		href1.company="vega";
		href1.price=780.5f;
		href1.color="pink";
		href1.type=Typesofhelmet.OFF_R_HELMET;
		href1.bikename="pulsur";
		
		href.avoidinjury();
		href1.weatherprotection();
	}
	

}
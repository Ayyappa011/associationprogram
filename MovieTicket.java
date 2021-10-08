class MovieTicket
{
	String name;
	String theater;
	float price;
	int noOfseats;
	String type;
	
	MovieTicket(String name,String theater,float price,int noOfseats,String type)
	{
		this.name=name;
		this.theater=theater;
		this.price=price;
		this.noOfseats=noOfseats;
		this.type=type;
		
	}
	MovieTicket(String name,float price,int noOfseats)
	{
		this.name=name;
		this.price=price;
		this.noOfseats=noOfseats;
		System.out.println("invoked 3 const");
	}
	void displayDetails()
	{
		System.out.println(this.name);
		System.out.println(this.theater);
		System.out.println(this.price);
		System.out.println(this.noOfseats);
		System.out.println(this.type);
	}
	void printTotalPrice()
	{
		float total = this.price*this.noOfseats;
		System.out.println(total);
	}
	
	public static void main(String[] mad)
	{
	MovieTicket Mref = new MovieTicket("PAPER BOY","REDDY THEATER",165,78,"BALCONY");
	Mref.displayDetails();
	Mref.printTotalPrice();
	
	MovieTicket Mref2 = new MovieTicket("true love end","REDDY THEATER",250,60,"BALCONY");
	Mref2.displayDetails();
	Mref2.printTotalPrice();
   }
}
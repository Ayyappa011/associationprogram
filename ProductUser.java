class ProductUser
{
	String name;
	String type;
	float price;
	int quantity;
	String vendor;
	static float totalProductCost;
	
	ProductUser(String name,String type,float price,int quantity,String vendor)
	{
		System.out.println("invoked 5 const");
		this.name=name;
		this.type=type;
		this.price=price;
		this.quantity=quantity;
		this.vendor=vendor;
	}
	ProductUser(float price,int quantity)
	{
		System.out.println("invoked 2 const");
		this.price=price;
		this.quantity=quantity;
	}
	
	void displayDetails()
	{
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(this.vendor);
	}
	
	void printtotalcost()
	{
		float total=this.price*this.quantity;
		System.out.println(total);
		totalProductCost=totalProductCost+total;
	}
	
	static void printTotalProductCost()
	{
		System.out.println("Total Product Price:"+totalProductCost);
	}
	
	public static void main(String[] kulli)
	{
		ProductUser kref = new ProductUser("SAM A21","EE",11999,5,"Sangeetha");
		kref.displayDetails();
		kref.printtotalcost();
		kref.printTotalProductCost();
		
		ProductUser Aref = new ProductUser("LG M20","EE",13999,8,"LG");
		Aref.displayDetails();
		Aref.printtotalcost();
		Aref.printTotalProductCost();
		
	}
	
}
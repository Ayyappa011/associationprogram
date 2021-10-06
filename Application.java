
class Application
{
	String name;
	int version;
	Company comp = new Company();
	void displaydetails()
	{
	 System.out.println(this.name);
	 System.out.println(this.version);
	 
	}
	public static void main(String[] kulli)
	{
		Application appref = new Application();
		appref.name="Windows";
		appref.version=11;
		appref.displaydetails();
		
		appref.comp = new Company();
		appref.comp.name="JSW";
		appref.comp.country="india";
		appref.comp.CEO="REDDY";
		appref.comp.CFO="YSR";
		appref.comp.displaydetails();
	}
}

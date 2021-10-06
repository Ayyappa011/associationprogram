//Country name, noOfstate,primistername,presidentwifename

   class Country44
{
	String Name;
	int noOfstate;
	String primistername;
	String presidentwifename;
	
	
	Country44(String mName,int mnoOfstate,String mprimistername,String mpresidentwifename)
	{
		Name=mName;
		noOfstate=mnoOfstate;
		primistername=mprimistername;
		presidentwifename=mpresidentwifename;
		
		System.out.println("hello and bye");
	}
	public static void main(String[] args)
	{
		Country44 countryref = new Country44("United States",50,"Joe Biden","Neilia Hunter Biden");
		
		System.out.println(countryref.Name);
		System.out.println(countryref.noOfstate);
		System.out.println(countryref.primistername);
		System.out.println(countryref.presidentwifename);
		
	}
}
	

class Laboratory

{
	String name;
	String location;
	int noOfrooms;
	String[] operatornames;
	Labtype branch;
	enum Labtype
	{
		EEE,CS ,RR
		
	}
	Laboratory(String name,String location, String[]operatornames,Labtype branch)
	{
		this.name=name;
		this.location=location;
		this.noOfrooms=noOfrooms;
		this.operatornames=operatornames;
		this.branch=branch;
		
		System.out.println("-------------------------------------");
				
	}
	Laboratory()
		{
			
		}
	public static void main(String[] mad)
	{
		String name="electricallab";
		String location="BTM 1st stg";
		 String[] operatornames={"reddy","lucky"};
		  Labtype branch=Labtype.EEE;
		
		Laboratory labref = new Laboratory(name,location,operatornames,branch);
		
		System.out.println(labref.name);
		System.out.println(labref.location);
	    System.out.println(labref.operatornames);
		System.out.println(labref.branch);
		
		
		
 	}
}

class Saloon
{
	String name;
	String location;
	float opentime;
	float clstime;
	SaloonBranch branch;
	enum SaloonBranch
	{
		KORMANGLA,JAYANAGAR,BTM;
	}
	
	
	void haircut()
	{
		System.out.println("invoked haircut");
		System.out.println("Saloon Details");
		System.out.println(name);
		System.out.println(location);
		System.out.println(opentime);
		System.out.println(clstime);
		System.out.println(branch);
		
	}
	
	public static void main(String[] mad)
	{
		Saloon sref = new Saloon();
		sref.name="smile";
		sref.location="BTM";
		sref.opentime=8.30f;
		sref.clstime=10.20f;
		sref.branch=SaloonBranch.BTM;
		
		
		Saloon sref2 = new Saloon();
		sref2.name="goodcutting";
		sref2.location="KORMANGLA";
		sref2.opentime=8.0f;
		sref2.clstime=7.30f;
		sref2.branch=SaloonBranch.KORMANGLA;
		
		sref.haircut();
		sref2.haircut();
	}
}

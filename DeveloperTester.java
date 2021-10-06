class DeveloperTester
{
	public static void main(String[] args)
	{
		Developer devref = new Developer();
		String name = devref.name;
		int age = devref.age;
		String companyname = devref.companyname;
		System.out.println(name);
		System.out.println(age);
		System.out.println(companyname );
		
		
		devref.name = "reddy";
		devref.age = 20;
		devref.companyname ="L&T";
		System.out.println(devref.name);
		System.out.println(devref.age);
		System.out.println(devref.companyname );
		
		devref.name = "Nagu";
		devref.age = 28;
		devref.companyname ="BEML";
		System.out.println(devref.name);
		System.out.println(devref.age);
		System.out.println(devref.companyname );
		
		devref.name = "lucky";
		devref.age = 48;
		devref.companyname ="capgemini";
		System.out.println(devref.name);
		System.out.println(devref.age);
		System.out.println(devref.companyname );
		
	}
}
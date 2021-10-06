class SpoonRunner22
{
	public static void main(String[] mak)
	{
		Spoon spnref = new Spoon();
		String name = spnref.name;
		float size = spnref.size;
		String type= spnref.type;
		System.out.println(name);
		System.out.println(size);
		System.out.println(type);
		
		
		spnref.name="flatware set";
		System.out.println(spnref.name);
		spnref.type="copper";
		System.out.println(spnref.type);
		spnref.size = 45.0f;
		System.out.println(spnref.size);
		
		
		spnref.name="spatula";
		System.out.println(spnref.name);
		spnref.type="wooden";
		System.out.println(spnref.type);
		spnref.size = 165.0f;
		System.out.println(spnref.size);
 		  
		  
	}
}
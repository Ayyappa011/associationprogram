class Test
{
	String name;
	int age;
	static int count;
	Test(String name,int age)
	
	{
		this.name=name;
		this.age=age;
		count++;
	}
	
	public static void main(String[] mad)
	{
		     Test t = new Test("reddy",15);
		     System.out.println(t.name);
		     System.out.println(t.age);
		     System.out.println(t.count);
		
			Test t2 = new Test("ayyappa",14);
			System.out.println(t2.name);
		    System.out.println(t2.age);
		    System.out.println(t2.count);
			
	}
	
}
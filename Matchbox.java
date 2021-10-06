//Matchbox  brand,noOfsticks,enum size,empty
class Matchbox{
	String name;
	int noOfsticks;
	boolean empty;
	boxtype size;
	enum boxtype
	{SMALL,MEDIUM,LARGE}
	
	
	Matchbox(String name,int noOfsticks,boolean empty,boxtype size)
	{
		this.name=name;
		this.noOfsticks=noOfsticks;
		this.empty=empty;
		this.size=size;
	}
	public static void main(String[] mad)
	{
		String name="Diamond";
		int noOfsticks=120;
		boolean empty=true;
		boxtype size=boxtype.SMALL;
		
		Matchbox boxref = new Matchbox(name,noOfsticks,empty,size);
		
		System.out.println(boxref.name);
		System.out.println(boxref.noOfsticks);
		System.out.println(boxref.empty);
		System.out.println(boxref.size);
		
		boxref.size=boxtype.LARGE;
		System.out.println("after changeing in the size");
		System.out.println(boxref.size);
		
	}
}
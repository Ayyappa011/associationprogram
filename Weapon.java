
class Weapon
{
	String name;
	String type;
	int rang;
	int cost;
	String color;
	
	
	
	Weapon(String name,String type,int rang,int cost,String color)
	{
		this.name=name;
		this.type=type;
		this.rang=rang;
		this.cost=cost;
		this.color=color;
		
		System.out.println("...............................");
	}
	Weapon(String type)
	{
		this.type=type;
	}
	Weapon(String name,String color)
	{
		this.name=name;
		this.color=color;
	
	}
	Weapon(int rang,int cost)
	{
		this.rang=rang;
		this.cost=cost;
	}
	
	public static void main(String[] mad)
	{
		Weapon weaponref = new Weapon("M16A2","ARMY",550,50000,"BLOCK");
		
		System.out.println(weaponref.name);
		System.out.println(weaponref.type);
		System.out.println(weaponref.rang);
		System.out.println(weaponref.cost);
		System.out.println(weaponref.color);
		System.out.println("-----------------------------------------------");
		
		
		Weapon weaponref1 = new Weapon("ARMY");
		System.out.println(weaponref1.type);
		System.out.println("-----------------------------------------------");
		
		Weapon weaponref2 = new Weapon("M16A2","BLOCK");
		System.out.println(weaponref2.name);
		System.out.println(weaponref2.color);
		System.out.println("-----------------------------------------------");
		
		Weapon weaponref3 = new Weapon(550,50000);
		System.out.println(weaponref3.rang);
		System.out.println(weaponref3.cost);
		
		
		
		
		
		
	}
	
	
}
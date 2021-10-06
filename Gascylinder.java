//Gascylinder  enum company,price,weight,cyliderno,enum size
   class Gascylinder
   {
	   gasname company;
	   enum gasname{HP,BHARTA}
	   float price;
	   int weight;
	   short cyliderno;
	   gastype size;
	   enum gastype{SMALL,MEDIUM,LARGE}
	   
	    Gascylinder(gasname company,float price,int weight,short cyliderno,gastype size)
		{
		
		this.company=company;
		this.price=price;
		this.weight=weight;
		this.cyliderno=cyliderno;
		this.size=size;
		}
	    
		public static void main(String[] mad)
		
		{     
		     
			gasname company=gasname.HP;
			float price=899.2f;
			int weight=54;
			short cyliderno=12;
			gastype size = gastype.MEDIUM;
			
			Gascylinder gas = new Gascylinder(company,price,weight,cyliderno,size);
			
			System.out.println(gas.company);
			System.out.println(gas.price);
			System.out.println(gas.weight);
			System.out.println(gas.cyliderno);
			System.out.println(gas.size);
		}
   
   

   }
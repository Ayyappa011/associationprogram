class ChocolateRunner{
	public static void main(String[] mad)
	{
		Chocolate chocoref = new Chocolate();
		String brand = chocoref.brand;
		float price = chocoref.price;
		float weight = chocoref.weight;
		System.out.println(brand);
		System.out.println(price);
		System.out.println(weight);
		
		chocoref.brand="kit kat";
		System.out.println(chocoref.brand);
		chocoref.price=66.0f;
		System.out.println(chocoref.price);
		
		Chocolate chocoref1 = new Chocolate();
		System.out.println(chocoref1.brand);
		System.out.println(chocoref1.price);
		System.out.println(chocoref1.weight);
		System.out.println(chocoref1.weight==chocoref.weight);
		
		
	}
}
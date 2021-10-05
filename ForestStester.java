class ForestStester
{
	
	public static void main(String[] kulli)
	{
	 Forest fore = new Forest("MM","mysuru");
	 System.out.println(fore.location);
	 System.out.println(fore.reserved);
	 System.out.println(fore.state);
	 
	 fore.state = new State("AYYAPPA REDDY");
	 System.out.println(fore.state.name);
	 System.out.println(fore.state.noofdistricts);
	 System.out.println(fore.state.Cmname);
	 System.out.println(fore.state.capitalcity);
	 
	 fore.state.capitalcity = new Capitalcity();
	 System.out.println(fore.state.capitalcity.name);
	 System.out.println(fore.state.capitalcity.population);
	 System.out.println(fore.state.capitalcity.famousfor);
	 
	}
}
class CricketTeam
{
	String batname;
	 String batting;
	 String role;
	 int topscored;
	 int noOf100s;
	 
	 CricketTeam(String btaname,String batting,String role,int topscored,int noOf100s)
	 {
		 this.batname=batname;
		 this.batting=batting;
		 this.role=role;
		 this.topscored=topscored;
		 this.noOf100s=noOf100s;
		 
		 System.out.println("...............................");
	 }
	 CricketTeam(String batname,int topscored)
	 {
		 this.batname=batname;
		 this.topscored=topscored;
		 
	 }
	 CricketTeam(String batting,String role,int noOf100s)
	 {
		 this.batting=batting;
		 this.noOf100s=noOf100s;
		 this.role=role;
	 }
	 
	 
	 
	 
	public static void main(String[] args)
	{
		CricketTeam teamref=new CricketTeam("CEAT","righthanded","opening batsman",264,29);
		
		System.out.println(teamref.batname);
		System.out.println(teamref.batting);
		System.out.println(teamref.role);
		System.out.println(teamref.topscored);
		System.out.println(teamref.noOf100s);
		System.out.println("...............................");
		 
		 
		CricketTeam teamref22 =new CricketTeam("CEAT",264);
		 
		System.out.println(teamref22.batname);
		System.out.println(teamref22.topscored);
		System.out.println("...............................");
		 
		 
		CricketTeam teamref55 =new CricketTeam("righthanded","opening batsman",29);
		 
		System.out.println(teamref55.batting);
		System.out.println(teamref55.role);
		System.out.println(teamref55.noOf100s);
		System.out.println("...............................");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
	}
	 
}

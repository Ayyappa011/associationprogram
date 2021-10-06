class Developers
{
	String name;
	int salary;
	int totalexp;
	 
	 Developers(String rname,int rsalary,int rtotalexp)
	 {
		 name = rname;
		 salary = rsalary;
		 totalexp = rtotalexp;
		 System.out.println("-----------------------------");
	 }
	 
	 public static void main(String[] args)
	 {
		 Developers developref = new Developers("ayyappa",2800,5);
		 
		 System.out.println(developref.name);
		 System.out.println(developref.salary);
		 System.out.println(developref.totalexp);
	 }
}
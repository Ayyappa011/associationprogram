// hospital name,location,owner, noOfbeds

 class Hospital
 {
	 String name;
	 String location;
	 String owner;
	 int noOfbeds;
	 
	 Hospital(String tname,String tlocation,String towner,int tnoOfbeds)
	 {
		 name = tname;
		 location = tlocation;
		 owner = towner;
		 noOfbeds = tnoOfbeds;
	 }
	 public static void main(String[] args)
	 {
		 Hospital hosref = new Hospital("Children's Minnesota","Avenue South","Dr. Marc Gorelick",1002);
		 System.out.println(hosref.name);
		 System.out.println(hosref.location);
		 System.out.println(hosref.owner);
		 System.out.println(hosref.noOfbeds);
	 }
 }
  
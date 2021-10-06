class Train
{
	String transport;
	
	 void transport()
	 {
		 System.out.println("invoked transport");
		 System.out.println(transport);
         this.start();
		 
	 }
	 static void start()
	 {
		 System.out.println("invoked start");
		 stop();
	 }
	 static void stop()
	 {
		 system.out.println("invoked stop");
		 
	 }
	 
	 public static void main(String[] mad)
	 {
		 Train train =new Train();
		 train.transport();
		 train.start();
		 
		 Train.start();
		train = new Train();
		train.transport();
		train.stop();
	 }
}
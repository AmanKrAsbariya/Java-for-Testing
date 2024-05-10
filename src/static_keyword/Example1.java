package static_keyword;

public class Example1 {
	
	//census report
	 String name; //instance variable
	 String address; 
	 static String city; //class variable
	 static int i = 0;
	// int i = 0;
	 
	 static {
		 city = "Jhajha";
	 }
	 
	 Example1(String name,String street){   
		 
		 this.name = name;        //local variable
		 this.address = street;   //global = local
		 i++;
		 System.out.println(i);
	 }
	 
	 public void getAddress() {
		 System.out.println(address + " " +city);
	 }
	 
	 public static void getCity() {
		 System.out.println(city);
	 }

	public static void main(String[] args) {
	//	Example1 e = new Example1("John","Babu Bank","Jhajha");
		Example1 e1 = new Example1("Jo","Shiv Bazar");
		
		Example1 e = new Example1("John","Babu Bank");
		e.getAddress();
		e1.getAddress();
		Example1.getCity();
		Example1.i=8;

	}

}

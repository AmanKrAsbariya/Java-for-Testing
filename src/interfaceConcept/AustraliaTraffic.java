package interfaceConcept;

public class AustraliaTraffic implements CentralTrafficRules,ContinentalTrafficRules {

	public static void main(String[] args) {
		
		AustraliaTraffic a = new AustraliaTraffic();
	//created AustraliaTraffic() object & implements method present in TrafficRules
		CentralTrafficRules b = new AustraliaTraffic();
		b.greenGo();
		b.redStop();
		b.yellowWait();
		a.walkOnSymbol(); //interface don't have this method defined
		
        ContinentalTrafficRules c = new AustraliaTraffic();
        c.trainSymbol();
	}
	
	
	public void walkOnSymbol() {
		System.out.println("walking");
	}
	
	@Override
	public void greenGo() {
		System.out.println("greenGo implementation");	
	}

	@Override
	public void redStop() {
		System.out.println("redStop implementation");	
		
	}

	@Override
	public void yellowWait() {
		System.out.println("yellowWait implementation");	
		
	}


	@Override
	public void trainSymbol() {
		System.out.println("trainSymbol implementation");	
	}
	
	

}

package Interface;

public class IndianTrafficSystem implements CentralTrafficSystem, AsianTrafficSystem {

	public static void main(String args[]) {
		
		CentralTrafficSystem CTS = new IndianTrafficSystem();
		AsianTrafficSystem ATS = new IndianTrafficSystem();
		IndianTrafficSystem ITS = new IndianTrafficSystem();
		
		CTS.redStop();
		CTS.greenGo();
		CTS.yellowSlow();
		ATS.drivingRules();
		ATS.driveSlow();
		AsianTrafficSystem.beepHorn();
		ITS.walkSymbol();
		System.out.println(licenseFee);
		System.out.println(CentralTrafficSystem.licenseFee);
		//System.out.println(CTS.licenseFee);	
		/*
		 * Line 20 explanation:
		 * you can access an interface variable using an object reference, 
		 * but it’s actually public static final and belongs to the interface, not the object. 
		 * Best practice is to use the interface name to avoid confusion
		 */
		
	}

	@Override
	public void redStop() {
		System.out.println("redStop implementation!!");
		
	}

	@Override
	public void greenGo() {
		System.out.println("greenGo implementation!!");
		
	}

	@Override
	public void yellowSlow() {
		System.out.println("yellowSlow implementation!!");
		
	}
	
	public void walkSymbol() {
		System.out.println("walkSymbol implementation!!");
	}

	@Override
	public void drivingRules() {
		System.out.println("drivingRules implementation!!");
		
	}
	
}

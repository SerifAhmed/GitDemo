package Interface;

public interface AsianTrafficSystem {

	public void drivingRules();
	
	default void driveSlow() {
		System.out.println("driveSlow in market places");
	}
	
	static void beepHorn() {
		System.out.println("beepHorn in busy areas");
	}
	
}

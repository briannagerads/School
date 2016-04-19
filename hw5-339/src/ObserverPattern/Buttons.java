package ObserverPattern;

public class Buttons implements ElevatorListener {
	
	/**
	 * true if clear to move, false if buttons were not activated
	 */
	boolean buttonsActivated;
	
	public Buttons() {
		buttonsActivated = false;
	}
	
	@Override
	public void movementDetection() {
		buttonsActivated = true;
		System.out.println("Buttons: Activated");
	}
	
	public boolean getState() {
		return buttonsActivated;
	}

	@Override
	public void clearState() {
		buttonsActivated = false;
	}

}

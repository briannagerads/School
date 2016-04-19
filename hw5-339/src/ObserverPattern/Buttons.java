package ObserverPattern;

public class Buttons implements ElevatorListener {

	@Override
	public void movementDetection() {
		System.out.println("Buttons: Activated");
	}

}

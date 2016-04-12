package ObserverPattern;

public abstract interface ElevatorListener {
	final Elevator elevator = new Elevator();
	public void movementDetection();
}

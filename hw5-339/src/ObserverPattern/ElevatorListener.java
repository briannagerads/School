package ObserverPattern;

public abstract interface ElevatorListener {
	public void movementDetection();
	public boolean getState();
	public void clearState();
}

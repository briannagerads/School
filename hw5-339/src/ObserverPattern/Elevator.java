package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Elevator {
	private List<ElevatorListener> listeners = new ArrayList<ElevatorListener>();
	/**
	 * Returns whether or not the elevator is moving
	 */
	private boolean state;
	
	public boolean getState() {
		return state;
	}
	
	public void setState(boolean state) {
		this.state = state;
	}
	
	public void activate( ElevatorListener e) {
		listeners.add(e);
	}
	
	public void verifyMovement() {
		for (ElevatorListener e : listeners ) {
			e.movementDetection();
		}
	}
}

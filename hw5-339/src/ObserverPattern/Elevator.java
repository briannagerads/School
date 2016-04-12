package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Elevator {
	private List<ElevatorListener> listeners = new ArrayList<ElevatorListener>();
	private int state;
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
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

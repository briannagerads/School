package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Elevator {
	private List<ElevatorListener> listeners = new ArrayList<ElevatorListener>();
	Buttons buttons = new Buttons();
	WeightSensor weightSensor = new WeightSensor();
	
	/**
	 * Returns whether or not the elevator is moving (true if has received signals to move, false if not moving and ready to move)
	 */
	private boolean state;
	
	public Elevator() {
		state = false;
		buttons.clearState();
		weightSensor.clearState();
	}
	
	public boolean getState() {
		if (state == true) System.out.println("Elevator is moving!");
		else
			System.out.println("Elevator is not moving!");
		return state;
	}
	
	public void activate( ElevatorListener e) {
		listeners.add(e);
	}
	
	public void clearElevator() {
		buttons.clearState();
		weightSensor.clearState();
		System.out.println("Elevator has been cleared!");
		listeners.clear();
	}
	
	public void verifyMovement() {
		for (ElevatorListener e : listeners ) {
			e.movementDetection();
			if (e.getState() ==  false) {
				state = false;
				break;
			} else {
				state = true;
			}
		}
		getState();
	}
}

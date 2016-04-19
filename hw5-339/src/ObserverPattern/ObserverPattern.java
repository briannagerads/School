package ObserverPattern;

public class ObserverPattern {
	
	/*
	 * Write a program that demonstrates the advantages of the Observer
	 * pattern. Your program should create an object that has state that
	 * needs to be observed. It should attach at least two observers to this
	 * object and it should then change the state of the observed object
	 * twice. Each time, the observers should indicate that they received
	 * the state change notification and retrieved and/or did something 
	 * with the new state.
	 */
	
	public static void main(String[] args) {
		Elevator elevator = new Elevator();
		
		elevator.activate(new WeightSensor());
		elevator.activate(new Buttons());
		elevator.verifyMovement();
		
		System.out.println();
		elevator.clearElevator();
		
		elevator.activate(new Buttons());
		elevator.verifyMovement();
	}
	
}

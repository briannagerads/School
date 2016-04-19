package ObserverPattern;

public class WeightSensor implements ElevatorListener {
	
	boolean weightSensorActivated;
	
	public WeightSensor() {
		ElevatorListener.elevator.activate(this);
		weightSensorActivated = false;
	}

	@Override
	public void movementDetection() {
		weightSensorActivated = true;
		System.out.println("Weight Sensor: Activated");
	}

}

package ObserverPattern;

public class WeightSensor implements ElevatorListener {
	
	/**
	 * True if clear to move, false if unsafe to move
	 */
	boolean weightSensorActivated;
	
	public WeightSensor() {
		weightSensorActivated = true;
	}

	@Override
	public void movementDetection() {
		weightSensorActivated = false;
		System.out.println("Weight Sensor: Activated\nToo much weight!");
	}
	
	public boolean getState() {
		return weightSensorActivated;
	}

	@Override
	public void clearState() {
		weightSensorActivated = true;
	}

}

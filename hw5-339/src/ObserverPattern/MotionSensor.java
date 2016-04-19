package ObserverPattern;

public class MotionSensor implements ElevatorListener {

	@Override
	public void movementDetection() {
		System.out.println("Motion Sensor: Activated");
	}

}

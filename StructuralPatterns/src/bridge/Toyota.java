package bridge;

public class Toyota implements DriveAPI {

	@Override
	public void driveCar(int time, int distance) {
		System.out.println("Toyota has got a " + (distance/time) + " km/hour speed!");
	}
	
}

package bridge;

public class Audi implements DriveAPI {

	@Override
	public void driveCar(int time, int distance) {
		System.out.println("Audi has got a " + (distance/time) + " km/hour speed!");
	}
	
}
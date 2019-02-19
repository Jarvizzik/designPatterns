package bridge;

public class SportCar extends Car {
	private int time,distance;

	public SportCar(int time,int distance, DriveAPI driveAPI) {
	      super(driveAPI);
	      this.time = time;  
	      this.distance = distance;  
	   }

	public void drive() {
		driveAPI.driveCar(time,distance);
	}
}

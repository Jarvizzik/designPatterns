package bridge;

public abstract class Car {
	protected DriveAPI driveAPI;
	
	protected Car(DriveAPI driveAPI) {
		this.driveAPI = driveAPI;
	}
	public abstract void drive();
}

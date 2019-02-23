package mvc;

public class CarView {
	public void displayCarInfo(Car car) {
		System.out.println("Car : " + car.getBrand() + " - " + car.getYear());
	}
}

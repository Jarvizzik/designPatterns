package mvc;

public class DBLayer implements ModelLayer {

	@Override
	public Car retrieveCarFromDB(String brand, Integer year) {
		Car car = new Car(brand, year);
		return car;
	}

}

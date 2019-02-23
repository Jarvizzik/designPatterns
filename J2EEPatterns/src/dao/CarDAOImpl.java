package dao;

import java.util.ArrayList;
import java.util.List;

public class CarDAOImpl implements CarDAO {

	// list is working as a database
	List<Car> cars;

	public CarDAOImpl() {
		cars = new ArrayList<>();
		cars.add(new Car(0, "Toyota"));
		cars.add(new Car(1, "Audi"));
	}

	@Override
	public List<Car> getAllCars() {
		return cars;
	}

	@Override
	public Car getCar(int id) {
		return cars.get(id);
	}

	@Override
	public void updateCar(int id, String brand) {
		cars.get(id).setBrand(brand);
	}

	@Override
	public void deleteCar(int id) {
		cars.remove(id);
	}

	@Override
	public void addCar(Car car) {
		cars.add(car);
	}

}

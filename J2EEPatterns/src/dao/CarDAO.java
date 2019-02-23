package dao;

import java.util.List;

public interface CarDAO {
	public List<Car> getAllCars();

	public void addCar(Car car);

	public Car getCar(int id);

	public void updateCar(int id, String brand);

	public void deleteCar(int id);
}

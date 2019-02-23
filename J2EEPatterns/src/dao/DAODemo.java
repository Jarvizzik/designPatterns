package dao;

public class DAODemo {
	public static void main(String[] args) {
		CarDAO carDAO = new CarDAOImpl();
		print(carDAO);

		carDAO.deleteCar(1);
		print(carDAO);

		carDAO.addCar(new Car(1, "Mercedes"));
		print(carDAO);

		carDAO.updateCar(0, "BMW");
		carDAO.getCar(0);

		print(carDAO);

	}

	public static void print(CarDAO carDAO) {
		for (Car car : carDAO.getAllCars()) {
			System.out.println(car);
		}
		System.out.println("==========");
	}
}

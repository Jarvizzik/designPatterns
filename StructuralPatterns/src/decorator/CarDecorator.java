package decorator;

public abstract class CarDecorator implements Car {

	protected Car car;
	
	public CarDecorator(Car car) {
		this.car = car;
	}

	@Override
	public void drive() {
		car.drive();
	}

}
